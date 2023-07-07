<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/list-tasks.css">
    <link rel="stylesheet" type="text/css" href="/css/header.css">
    <title>Priority Tracker</title>
</head>
<body>
<%@ include file="header.jsp" %><br/>
<button class="add-task-button" onclick="location.href='/priority-tracker/add-task'">Add New Task</button>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Description</th>
        <th>Priority</th>
        <th>Start date</th>
        <th>End date</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${tasks}" var="task">
        <tr>
            <td>${task.id}</td>
            <td>${task.description}</td>
            <td>${task.priority}</td>
            <td>${task.startDate}</td>
            <td>${task.endDate}</td>
            <td>
                <a href="/priority-tracker/list-tasks/update?id=${task.id}" class="add-task-button">Update</a>
                <a href="/priority-tracker/list-tasks/delete-confirm?id=${task.id}" class="delete-task-button">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>