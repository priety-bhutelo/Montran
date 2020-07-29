package com.montran.util;

import com.montran.pojo.Employee;

public class EmployeeUtil {

	private Employee[] employees;
	private int nextIndex = 0;
	private int maxIndex;

	public EmployeeUtil(int employeesLength) {
		employees = new Employee[employeesLength];
		maxIndex = employeesLength;
	}

	public void addEmployee(Employee employee) {
		if (nextIndex >= 0 && nextIndex < maxIndex) {
			employees[nextIndex] = employee;
		}
		nextIndex++;
	}

	public Employee[] getAllEmployees() {
		return employees;
	}

}
