package com.montran.main;

import com.montran.pojo.Employee;
import com.montran.util.EmployeeUtil;

public class ArrayMainV3 {
	public static void main(String[] args) {

		EmployeeUtil employeeUtil = new EmployeeUtil(4);

		Employee employee = new Employee(101, "Vivek Gohil", 1000);
		Employee employee2 = new Employee(102, "Arjun Kapadia", 2000);
		// Employee employee3 = new Employee(103, "Abhishek Gupta", 2000);
		// Employee employee4 = new Employee(104, "Test", 2000);

		System.out.println(employee);
		System.out.println(employee2);
		// System.out.println(employee3);
		// System.out.println(employee4);

		System.out.println("in main calling addEmployee ");
		System.out.println("-------------------------------------------");
		employeeUtil.addEmployee(employee);
		employeeUtil.addEmployee(employee2);
		// employeeUtil.addEmployee(employee3);
		// employeeUtil.addEmployee(employee4);

		System.out.println("Employees in array");

		Employee[] emps = employeeUtil.getAllEmployees();
		for (Employee emp : emps) {
			System.out.println(emp);
		}

	}
}
