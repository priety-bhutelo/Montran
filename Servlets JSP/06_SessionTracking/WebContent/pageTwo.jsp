<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Two</title>
</head>
<body>
	<%-- <%!String firstName, lastName;%>
	<%!int age;%> --%>
	<h3>Page Two</h3>
	<%-- <%
		firstName = request.getParameter("txtFirstName");
		lastName = request.getParameter("txtLastName");
		age = Integer.parseInt(request.getParameter("txtAge"));

		session.setAttribute("fName", firstName);
		session.setAttribute("lName", lastName);
		session.setAttribute("age", age);
	%>
 --%>
	<hr>
	<form action="pageThree.jsp" method="post">
		<table>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="rdoGender" value="Female">
					Female <br> <input type="radio" name="rdoGender" value="Male">
					Male <br></td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td><select name="ddlQualification">
						<option value="S.S.C">S.S.C</option>
						<option value="H.S.C">H.S.C</option>
						<option value="Graduate">Graduate</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Print"></td>
				<td></td>
			</tr>
		</table>
		<%-- <input type="hidden" name="txtFirstName" value="<%=firstName%>"><br>
		<br> <input type="hidden" name="txtLastName"
			value="<%=lastName%>"> <br> <br> <input
			type="hidden" name="txtAge" value="<%=age%>"><br> <br> --%>
	</form>
</body>
</html>