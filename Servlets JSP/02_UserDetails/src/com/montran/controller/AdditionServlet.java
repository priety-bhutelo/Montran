package com.montran.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet {
	private int numberOne;
	private int numberTwo;
	private PrintWriter out;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		numberOne = Integer.valueOf(request.getParameter("txtNumberOne"));
		numberTwo = Integer.valueOf(request.getParameter("txtNumberTwo"));
		response.setContentType("text/html");
		out.println("<h3>Addition of " + numberOne + " and  " + numberTwo + " is " + (numberOne + numberTwo) + "</h3>");
	}

}
