package com.montran.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInfoServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("Name :: Vivek Gohil");
		out.println("Address :: Parel ");
		out.println("Contact :: 9920728158");
		out.println("Email:: ghl_vivek@hotmail.com");
		out.println("Gender :: Male");
	}

}
