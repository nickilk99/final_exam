<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<title>Register</title>
</head>
<body>
<header><a href="register">Register</a> | <a href="login">Login</a></header>
	<div align="center">
		<form:form action="addUser" method="post" modelAttribute="user">
			<table>
				<tr>
					<td>Email:</td>
					<td><form:input path="Email" /></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><form:password path="Password" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Register"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>