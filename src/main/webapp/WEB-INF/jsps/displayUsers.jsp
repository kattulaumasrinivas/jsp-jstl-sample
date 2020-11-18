<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users List</title>
</head>
<body>

<h2>Users:</h2>
<table>
<tr>
<th>id</th>
<th>name</th>
<th>gender</th>
<th>email</th>
<th>phone</th>
<th>address</th>
<th>city</th>
</tr>

<c:forEach items="${users}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.gender}</td>
<td>${user.email}</td>
<td>${user.phone}</td>
<td>${user.address}</td>
<td>${user.city}</td>
<td><a href="deleteUser?id=${user.id}">delete</a></td>
<td><a href="showUpdate?id=${user.id}">edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add User</a>
</body>
</html>