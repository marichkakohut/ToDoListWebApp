package com.softserve.itacademy.controller;

import com.softserve.itacademy.model.Task;
import com.softserve.itacademy.repository.TaskRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tasks/delete")
public class DeleteServlet extends HttpServlet {
    private TaskRepository taskRepository;

    @Override
    public void init() throws ServletException {
        taskRepository =TaskRepository.getTaskRepository();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        taskRepository.delete(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("/WEB-INF/tasks-list");
    }
}
