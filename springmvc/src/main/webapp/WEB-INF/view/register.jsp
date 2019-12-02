<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<fieldset>
		<legend>Register Page</legend>
		<form action="./register" method="post">
			<label>Registration form</label>
			<table>

				<tr>
					<td>Name</td>
					<td><input type="text" name="retailerName" required="required"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="retailerEmail" required="required"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="retailerPassword" required="required"></td>
				</tr>

				<tr>
					<td><input type="submit" value="register"></td>
					<td><input type="reset" value="reset"></td>
				</tr>

			</table>
		</form>
		<a href="./login">click me to login</a>
	</fieldset>
</body>
</html>