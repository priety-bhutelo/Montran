package com.montran.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.montran.dao.EmployeeDAO;
import com.montran.pojo.Employee;

public class AddEmployeeServlet extends HttpServlet {

	private int employeeId;
	private String name;
	private double salary;
	private PrintWriter out;
	private EmployeeDAO dao;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		employeeId = Integer.parseInt(request.getParameter("txtEmployeeId"));
		name = request.getParameter("txtName");
		salary = Double.parseDouble(request.getParameter("txtSalary"));

		out = response.getWriter();

		out.println("Employee Id :: " + employeeId);
		out.println("Name :: " + name);
		out.println("Salary :: " + salary);

		Employee employee = new Employee(employeeId, name, salary);

		dao = new EmployeeDAO();
		if (dao.addEmployee(employee))
			out.println("Employee added successfully !!");
		else
			out.println("Failed to add employee !!");

	}

}
