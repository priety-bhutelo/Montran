package com.montran.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.montran.pojo.UserDetails;

public class UserLoginServlet extends HttpServlet {

	private String userId;
	private String password;
	private boolean flag = true;
	private String message = "";

	private HttpSession session;
	private UserDetails userDetails;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		session = request.getSession();

		if (request.getParameter("txtUserId") != null && !request.getParameter("txtUserId").equals("")) {
			userId = request.getParameter("txtUserId");
		} else
			flag = false;
		if (request.getParameter("txtPassword") != null && !request.getParameter("txtPassword").equals("")) {
			password = request.getParameter("txtPassword");
		} else
			flag = false;

		if (flag) {
			if (session.getAttribute("user") != null) {
				userDetails = (UserDetails) session.getAttribute("user");
				System.out.println(userDetails);
				if (userDetails != null && userDetails.getUserId().equals(userId)) {
					if (userDetails.getPassword().equals(password)) {
						response.sendRedirect("userHome.jsp");
					} else {
						message = "<h4>Invalid Password</h4>";
						session.setAttribute("message", message);
						response.sendRedirect("login.jsp");
					}
				} else {
					message = "<h4>Invalid UserId</h4>";
					session.setAttribute("message", message);
					response.sendRedirect("login.jsp");
				}
			} else {
				message = "<h4>Enter valid userId and password !!</h4>";
				session.setAttribute("message", message);
				response.sendRedirect("login.jsp");
			}
		} else {
			System.out.println("In Else");
			message = "<h4>Enter valid userId and password !!</h4>";
			session.setAttribute("message", message);
			response.sendRedirect("login.jsp");
		}

	}

}
