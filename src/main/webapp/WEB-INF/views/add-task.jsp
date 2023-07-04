<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<form action="" method="POST">
    <label for="description">Description:</label>
    <input type="text" id="description" name="description" required><br><br>

    <label for="priority">Priority:</label>
    <select id="priority" name="priority" required>
        <option value="Very High">Very High</option>
        <option value="High">High</option>
        <option value="Medium">Medium</option>
        <option value="Low">Low</option>
    </select><br><br>

    <label for="startDate">Start Date:</label>
    <input type="date" id="startDate" name="startDate" required><br><br>

    <label for="endDate">End Date:</label>
    <input type="date" id="endDate" name="endDate" required><br><br>

    <input type="submit" value="Save Task">
</form>
</body>
</html>