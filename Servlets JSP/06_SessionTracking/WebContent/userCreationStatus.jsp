<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Creation Status</title>
</head>
<body>
	<%!String message = "No Set";%>
	<h3>User CreationStatus</h3>
	<%
		if (session.getAttribute("message") != null) {
			message = session.getAttribute("message").toString();
		}
	%>

	<h4><%=message%></h4>

	<a href="login.jsp">Login</a>
</body>
</html>