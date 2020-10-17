package com.softserve.itacademy.controller;

import com.softserve.itacademy.model.Task;
import com.softserve.itacademy.repository.TaskRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("tasks/update")
public class UpdateTaskServlet extends HttpServlet {
    private TaskRepository taskRepository;
    private Task task;

    @Override
    public void init() throws ServletException {
        taskRepository =TaskRepository.getTaskRepository();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        task = taskRepository.read(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("task", task);
        request.getRequestDispatcher("/WEB-INF/update-task.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        task.setTitle(request.getParameter("title"));
      //  task.setPriority(request.getParameter("priority"));
       // taskRepository.update(task.getId(),task);
        taskRepository.update(task);
        response.sendRedirect("/tasks/list");
    }

}
