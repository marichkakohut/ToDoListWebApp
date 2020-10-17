<%@ page import="com.softserve.itacademy.model.Task" %><%--
  Created by IntelliJ IDEA.
  User: Marichka
  Date: 17.10.2020
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update existing Task</title>
</head>
<body>

<%@include file="header.html"%>
<br>
<form action="/tasks/update" method="post">


    <h1>Update Task</h1>

    <%

        Task task = (Task) request.getAttribute("task");
    %>

    <table>
     <tr>
         <td>
             <label for="id">Id: </label>
         </td>
         <td>
             <input type="text" id="id" name="id" value="<%=task.getId()%>" disabled>
         </td>

    </tr>
        <tr>
            <td>
                <label for="Name">Name: </label>
            </td>
            <td>
                <input type="text" id="Name" name="Name" value="<%=task.getTitle()%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for="Priority">Priority: </label>
            </td>
            <td>
                <select id="Priority" name="Priority">
                    <option>Low</option>
                    <option>Medium</option>
                    <option>High</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update">
            </td>
            <td>
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
