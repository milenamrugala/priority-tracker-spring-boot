<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/confirmation.css">
    <link rel="stylesheet" type="text/css" href="/css/header.css">
    <title>Priority Tracker</title>
</head>
<body>
<%@ include file="header.jsp" %><br/>
<h2>Are you sure you want to delete this task?</h2>
<div class="button-container">
    <a href="<c:url value="/priority-tracker/list-tasks/delete?id=${id}"/>" class="button delete">Delete</a>
    <a href="<c:url value='/priority-tracker/list-tasks'/>" class="button cancel">Cancel</a>
</div>
</body>
</html>