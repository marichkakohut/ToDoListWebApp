package com.softserve.itacademy.controller;

import com.softserve.itacademy.model.Priority;
import com.softserve.itacademy.model.Task;
import com.softserve.itacademy.repository.TaskRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task/create")
public class CreateTaskServlet extends HttpServlet {

    private TaskRepository taskRepository;

    @Override
    public void init() throws ServletException {
        taskRepository =TaskRepository.getTaskRepository();
    }

 //   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   //    request.getRequestDispatcher("/WEB-INF/create-tasks.jsp").forward(request,response);
    //}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("/WEB-INF/create-tasks.jps");
        request.setAttribute("tasks",taskRepository.all());
        requestDispatcher.forward(request, response);
      //  String title =   request.getParameter("title");
        //Priority priority = Priority.valueOf(request.getParameter("priority"));
        //Task task = new Task(title, priority);
        //taskRepository.create(task );
         response.sendRedirect("/tasks/create- tasks");
    }
}
