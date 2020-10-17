package com.softserve.itacademy.controller;

import com.softserve.itacademy.repository.TaskRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tasks/list")
public class TaskListServlet extends HttpServlet {
    private TaskRepository taskRepository;

    @Override
    public void init() throws ServletException {
        taskRepository =TaskRepository.getTaskRepository();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/tasks-list.jsp");
       request.setAttribute("tasks",taskRepository.all());

        requestDispatcher.forward(request,response);
    }
}
