<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String id = "";
	Cookie[] cookies = request.getCookies();
	if(cookies!=null) {
	for(Cookie cookie :cookies) {
		if(cookie.getName().equals("alwaysRemember"));
		{
			id=cookie.getValue();
		}
	}
	}
	%>
<body>
<fieldset>
<legend>Login</legend>
<form action ="./login" method="post" >
<table >
<tr>
<td>Id  </td>
<td><input type= "number" name = "id" value="<%=id%>"> </td>
</tr>
<tr><td>Password  </td>
<td><input type = "password" name = "password"></td></tr>
<tr>
<td><input type ="checkbox" name = "rememberme"  value = "check"></td>
	</tr>
	<tr>
	<td><input type = "submit"  value ="Login"></td>
	<td><input type = "reset" value = "reset"></td></tr>
</table>
</form>
</fieldset>

</body>
</html>