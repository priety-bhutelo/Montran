<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Three</title>
</head>
<body>
	<%!String firstName, lastName, gender, qualification;%>
	<%!int age;%>
	<h3>Page Three</h3>
	<br>
	<%
		/* 	firstName = request.getParameter("txtFirstName");
			lastName = request.getParameter("txtLastName");
			age = Integer.parseInt(request.getParameter("txtAge")); */
		/* firstName = session.getAttribute("fName").toString();
		lastName = session.getAttribute("lName").toString();
		age = Integer.parseInt(session.getAttribute("age").toString()); */

		Cookie[] allCookies = request.getCookies();
		for (Cookie cookie : allCookies) {
			if (cookie.getName().equals("fName")) {
				firstName = cookie.getValue();
				firstName = URLDecoder.decode(firstName, "UTF-8");
			}
			if (cookie.getName().equals("lName")) {
				lastName = cookie.getValue();
				lastName = URLDecoder.decode(lastName, "UTF-8");
			}
			if (cookie.getName().equals("age")) {
				age = Integer.valueOf(cookie.getValue());
			}
		}

		gender = request.getParameter("rdoGender");
		qualification = request.getParameter("ddlQualification");
	%>

	<h3>
		First Name
		<%=firstName%></h3>
	<h3>
		Last Name
		<%=lastName%></h3>
	<h3>
		age<%=age%></h3>
	<h3>
		Gender
		<%=gender%></h3>
	<h3>
		Qualification
		<%=qualification%></h3>

</body>
</html>