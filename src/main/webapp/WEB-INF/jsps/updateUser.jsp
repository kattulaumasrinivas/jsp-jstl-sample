<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create User</title>
</head>
<body>

	<form action="updateUser" method="post">
		<pre>
Id: <input type="text" name="id" value="${user.id}" readonly />
Name: <input type="text" name="name" value="${user.name}" />
Type: <select name="type">
		<option ${user.gender == 'Male' ? 'selected' : ''}>Male</option>
		<option ${user.gender == 'Female' ? 'selected' : ''}>Female</option>
	  </select>
Email: <input type="text" name="email" value="${user.email}"/>
Phone: <input type="text" name="phone" value="${user.phone}"/>
Address: <textarea rows="4" cols="50" name="address">${user.address}</textarea>
City: <input type="text" name="code" value="${user.city}" />
<input type="submit" value="save" />
</pre>
	</form>

</body>
</html>