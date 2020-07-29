package com.montran.pojo;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	// crtl + space -- default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// alt + shift + s , o -- param. constructor
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	// alt + shift + s , r -- getter and setter
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// alt + shift + s , s -- toString()
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

	// ctl + shift + f -- format the code
}
