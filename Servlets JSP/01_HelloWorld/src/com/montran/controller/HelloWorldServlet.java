package com.montran.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	public HelloWorldServlet() {
		System.out.println("Servlet Object Is Created !!");
	}

	public void init() throws ServletException {
		System.out.println("init method called");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h3>Hello World  !!</h3><br>");
		out.println("<h4>Hello World  !!</h4><br>");
		out.println("<h5>Hello World  !!</h5><br>");
		out.println("<h6>Hello World  !!</h6><br>");
		out.println("<h6>Requested By Arjun  !!</h6>");

		System.out.println("Service method called ");
	}

	public void destroy() {
		System.out.println("Destroy method called");
	}
}
