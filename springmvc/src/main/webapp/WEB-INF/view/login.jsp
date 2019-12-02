<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h4 style="color: red">${message}</h4>
	<fieldset>
		<legend>Login Page</legend>
		<form action="./login" method="post">
			<table >
				<tr>
					<td>Id:</td>
					<td><input type="text" name="retailerId"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="retailerPassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="login"></td>
					<td><input type="reset" value="reset"></td>
				</tr>
			</table>
		</form>
		<a href="./register">click me to register</a>
	</fieldset>
</body>
</html>