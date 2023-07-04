<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/add-task.css">
    <title>Add Task</title>
</head>
<body>
<h1>Add Task</h1>
<button class="add-task-button" onclick="location.href='/priority-tracker/list-tasks'">Task Lists</button>
<%--@elvariable id="task" type="pl.milenamrugala.prioritytrackerspringboot.model.Task"--%>
<form:form action="" method="POST" modelAttribute="task">
    <label for="description">Description:</label>
    <form:input path="description"/>

    <label for="priority">Priority:</label>
    <select id="priority" name="priority" required>
        <option value="Very High">Very High</option>
        <option value="High">High</option>
        <option value="Medium">Medium</option>
        <option value="Low">Low</option>
    </select><br><br>

    <label for="startDate">Start Date:</label>
    <form:input path="startDate"/>

    <label for="endDate">End Date:</label>
    <form:input path="endDate"/>

    <input type="submit" value="Update Task">
</form:form>
</body>
</html>