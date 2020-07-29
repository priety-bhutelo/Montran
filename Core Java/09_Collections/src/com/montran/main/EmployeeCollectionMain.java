package com.montran.main;

import java.util.List;
import java.util.Scanner;

import com.montran.pojo.Employee;
import com.montran.util.EmployeeCollectionUtil;

public class EmployeeCollectionMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeCollectionUtil util = new EmployeeCollectionUtil();
		List<Employee> employeeList;

		Employee employee;
		int employeeId;
		String name;
		double salary;

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter employeeId");
			employeeId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name");
			name = scanner.nextLine();

			System.out.println("Enter Salary");
			salary = scanner.nextDouble();

			employee = new Employee(employeeId, name, salary);

			System.out.println("Add New Employee");
			util.addNewEmployee(employee);
		}
		System.out.println("-------------------------------------");
		System.out.println("Printing All Employees");
		employeeList = util.getAllEmployees();
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

	}
}
