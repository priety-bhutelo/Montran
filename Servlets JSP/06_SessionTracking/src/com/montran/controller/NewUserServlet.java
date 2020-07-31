package com.montran.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.montran.pojo.UserDetails;

/**
 * Servlet implementation class NewUserServlet
 */
public class NewUserServlet extends HttpServlet {
	private String userId;
	private String password;
	private String name;
	private boolean flag = true;
	private String message;

	private UserDetails userDetails;
	private HttpSession session;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("txtUserId") != null && !request.getParameter("txtUserId").equals("")) {
			userId = request.getParameter("txtUserId");
		} else
			flag = false;
		if (request.getParameter("txtPassword") != null && !request.getParameter("txtPassword").equals("")) {
			password = request.getParameter("txtPassword");
		} else
			flag = false;
		if (request.getParameter("txtName") != null && !request.getParameter("txtName").equals("")) {
			name = request.getParameter("txtName");
		} else
			flag = false;

		session = request.getSession();
		System.out.println("Flag = " + flag);
		if (flag) {
			userDetails = new UserDetails(userId, password, name);
			session.setAttribute("user", userDetails);
			message = "<h4>User Created Successfully !!</h4>";
			session.setAttribute("message", message);
		} else {
			message = "<h4>Failed To Create User !!</h4>";
			session.setAttribute("message", message);
			flag = true;
		}

		response.sendRedirect("userCreationStatus.jsp");
	}

}
