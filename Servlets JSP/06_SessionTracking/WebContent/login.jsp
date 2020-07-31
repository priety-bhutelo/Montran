<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<%!String message = "";%>
	<h3>User Login</h3>
	<hr>
	<%
		if (session.getAttribute("message") != null) {
			message = session.getAttribute("message").toString();
		}
	%>
	<form action="UserLoginServlet" method="post">
		<table>
			<tr>
				<td>User ID</td>
				<td><input type="text" name="txtUserId"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="txtPassword"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="newUser.html">New User</a></td>
			</tr>
			<tr>
				<td><%=message%></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>