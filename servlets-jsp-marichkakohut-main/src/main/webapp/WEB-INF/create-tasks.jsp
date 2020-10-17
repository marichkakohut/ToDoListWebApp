<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Task</title>
</head>
<body>
<%@include file="header.html"%>
<br><br>
<form action="/tasks/create" method="post">


    <h1>Create new Task</h1>

    <table>
        <tr>
            <td>
                <label for="Name">Name: </label>
            </td>
            <td>
                <input type="text" id="Name" name="Name">
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
                <input type="submit" value="Create">
            </td>
            <td>
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
