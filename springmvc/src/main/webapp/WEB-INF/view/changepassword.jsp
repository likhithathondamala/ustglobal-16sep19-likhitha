<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<label>Change Password</label> <a href="./home">Home</a> <br> <a
			href="./logout">LogOut</a> <br>
		<form action="./changepassword" method="post">
			<table>
				<tr>
					<td>New Password</td>
					<td><input type="password" name="newpassword"></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="change"></td>
					<td><input type="reset" value="reset"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>