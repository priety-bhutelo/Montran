package com.montran.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDetailsServlet extends HttpServlet {
	private String name;
	private PrintWriter out;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		out = response.getWriter();
		name = request.getParameter("txtUserName");
		response.setContentType("text/html");
		out.println("<h3>Welcome " + name + "</h3>");
	}
}
