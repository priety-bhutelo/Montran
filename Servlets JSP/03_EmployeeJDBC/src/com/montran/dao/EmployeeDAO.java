package com.montran.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.montran.pojo.Employee;

public class EmployeeDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String user = "montran";
	private String password = "montran";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private int count;

	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;

	public boolean addEmployee(Employee employee) {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				sql = "insert into employee_master values(?,?,?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, employee.getEmployeeId());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setDouble(3, employee.getSalary());

				count = preparedStatement.executeUpdate();
				if (count > 0)
					return true;
			}
		} catch (SQLException e) {
			System.out.println("in catch");
			System.out.println("SQLException !!");
			return false;
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException !!");
		} finally {
			try {
				System.out.println("in finally");
				connection.close();
			} catch (SQLException e) {
				System.out.println("SQLException !!");
			}
		}
		return false;
	}
}
