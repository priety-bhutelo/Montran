package com.montran.util;

import java.util.ArrayList;
import java.util.List;

import com.montran.pojo.Employee;

public class EmployeeCollectionUtil {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public boolean addNewEmployee(Employee employee) {
		employeeList.add(employee);
		return false;
	}

	public List<Employee> getAllEmployees() {
		return employeeList;
	}

}
