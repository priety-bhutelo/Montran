package com.montran.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.montran.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "montran";
		String password = "montran";
		String sql = "";
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		Employee employee = new Employee(102, "Vivek", 1000);

		try {
			// 1. Load jdbc driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully.");

			// 2. Connect to database
			Connection connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection Success !! ");
//				sql = "insert into employee_master values(?,?,?)";
//
//				// 3. create query and pass it to preparedStatement
//				preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setInt(1, employee.getEmployeeId());
//				preparedStatement.setString(2, employee.getName());
//				preparedStatement.setDouble(3, employee.getSalary());
//
//				// 4. execute query on database
//				preparedStatement.executeUpdate();
//
//				connection.close();
//				System.out.println("Recored inserted successfully !!");

//				sql = "update employee_master set name=? , salary=? where employee_id=?";
//				preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setString(1, "Arjun");
//				preparedStatement.setDouble(2, 2000);
//				preparedStatement.setInt(3, 102);
//
//				preparedStatement.executeUpdate();
//				connection.close();
//
//				System.out.println("Recored Updated Successfully !!");

//				sql = "delete from employee_master where employee_id = ?";
//				preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setInt(1, 102);
//
//				preparedStatement.executeUpdate();
//				connection.close();
//
//				System.out.println("Recored deleted Successfully !!");

				sql = "select * from employee_master order by employee_id";
				preparedStatement = connection.prepareStatement(sql);

				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					System.out.println("Employee Id :: " + resultSet.getInt("employee_id"));
					System.out.println("Name :: " + resultSet.getString("name"));
					System.out.println("Salary :: " + resultSet.getDouble("salary"));
					System.out.println("----------------------------------------");
				}

			} else
				System.out.println("Connection failed !!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
