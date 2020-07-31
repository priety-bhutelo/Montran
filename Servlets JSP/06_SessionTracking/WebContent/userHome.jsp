<%@page import="com.montran.pojo.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
</head>
<body>
	<%!UserDetails userDetails;%>
	<h3>User Home</h3>
	<hr>
	<%
		if (session.getAttribute("user") != null) {
			userDetails = (UserDetails) session.getAttribute("user");
		}
	%>
	<h4>
		Welcome
		<%=userDetails.getName()%>
	</h4>

	<br>
	<br>
	<a href="LogoutServlet">Logout</a>
</body>
</html>