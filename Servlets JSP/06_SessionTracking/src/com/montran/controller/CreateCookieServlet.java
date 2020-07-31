package com.montran.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieServlet extends HttpServlet {

	private String firstName;
	private String lastName;
	private int age;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		firstName = request.getParameter("txtFirstName");
		firstName = URLEncoder.encode(firstName, "UTF-8");
		lastName = request.getParameter("txtLastName");
		lastName = URLEncoder.encode(lastName, "UTF-8");
		age = Integer.parseInt(request.getParameter("txtAge"));

		// Write data in cookie
		Cookie fNameCookie = new Cookie("fName", firstName);
		Cookie lNameCookie = new Cookie("lName", lastName);
		Cookie ageCookie = new Cookie("age", String.valueOf(age));

		fNameCookie.setMaxAge(60 * 60);
		lNameCookie.setMaxAge(60 * 60);
		ageCookie.setMaxAge(60 * 60);

		response.addCookie(fNameCookie);
		response.addCookie(lNameCookie);
		response.addCookie(ageCookie);

		response.sendRedirect("pageTwo.jsp");
	}
}
