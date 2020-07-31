package com.montran.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class LogoutServlet extends HttpServlet {

	private String message;
	private HttpSession session;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		session = request.getSession();

		// session.invalidate();
		if (session.getAttribute("user") != null) {
			session.setAttribute("user", null);
			// session.removeAttribute("user");
			message = "<h4>Logout Success !!</h4>";
		}
		session.setAttribute("message", message);

		response.sendRedirect("login.jsp");

	}

}
