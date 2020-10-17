<%@ page import="com.softserve.itacademy.model.Task" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all tasks</title>
</head>
<body>
<%@include file="header.html"%>
<table border="1">
    <tr>
        <th>No.</th>
        <th>Name</th>
        <th>Priority</th>
        <th>Operation</th>
    </tr>

    <%
        for (Task task : (List<Task>)request.getAttribute("tasks") ) {
        %>
    <tr>
        <td><%=task.getId()%></td>
        <td><%=task.getTitle()%></td>
        <td><%=task.getPriority()%></td>
        <td>
            <a href="tasks/read?id=<%=task.getId()%>">Read</a>
        </td>
        <td>
            <a href="tasks/edit?id=<%=task.getId()%>">Edit</a>
        </td>
        <td>
            <a href="tasks/delete?id=<%=task.getId()%>">Delete</a>
        </td>
    </tr>
    <%

        }
    %>
</table>
</body>
</html>
