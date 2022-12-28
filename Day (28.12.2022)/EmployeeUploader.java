package com.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class IDNotFoundException extends Exception { // Created a custom Exception 1
	IDNotFoundException(String str) {
		super(str);
	}
}

class InvalidSalaryException extends Exception { // Created a custom Exception 2
	InvalidSalaryException(String str) {
		super(str);
	}
}

public class EmployeeUploader { // class
	Scanner sc = new Scanner(System.in);
	int d_id, e_id;
	double e_sal;
	String e_name, d_name, d_head, d_desc, e_add;
	long e_phone;

	// saving Employee details in databse
	public void storeEmployeeDetails() throws SQLException, InvalidSalaryException {
		System.out.println("Enter Employee id: ");
		e_id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		e_name = sc.next();
		System.out.println("Enter Employee Address: ");
		e_add = sc.next();
		System.out.println("Enter Employee Salary: ");
		e_sal = sc.nextDouble();
		System.out.println("Enter Employee Contact no: ");
		e_phone = sc.nextLong();
		System.out.println("Enter Employee Department ID: ");
		d_id = sc.nextInt();

		if (e_sal < 1000) {
			throw new InvalidSalaryException("Salary cant be less than 1000");
		} else {

			Connection conn = Helper1.con();

			PreparedStatement stmt = conn.prepareStatement("insert into Employee_2 values(?,?,?,?,?,?)");
			stmt.setInt(1, e_id);
			stmt.setString(2, e_name);
			stmt.setString(3, e_add);
			stmt.setDouble(4, e_sal);
			stmt.setLong(5, e_phone);
			stmt.setInt(6, d_id);
			stmt.executeUpdate();
			System.out.println("Data inserted & saved successfully------------------");
		}

	}

	// saving Department details in databse
	public void storeDepartmentDetails() throws SQLException {
		System.out.println("Enter Department id: ");
		d_id = sc.nextInt();
		System.out.println("Enter Department Name: ");
		d_name = sc.next();
		System.out.println("Enter Department head: ");
		d_head = sc.next();
		System.out.println("Enter Department description: ");
		d_desc = sc.next();

		Connection conn = Helper1.con();

		PreparedStatement stmt = conn.prepareStatement("insert into Department values(?,?,?,?)");
		stmt.setInt(1, d_id);
		stmt.setString(2, d_name);
		stmt.setString(3, d_head);
		stmt.setString(4, d_desc);
		stmt.executeUpdate();
		System.out.println("Data inserted & saved successfully------------------");

	}

	// fetching data
	public void retrieveEmployeeDetails(int id) throws IDNotFoundException, SQLException {
		Connection conn = Helper1.con();
		Statement stmt = conn.createStatement();
		// execute query fetch data from database
		ResultSet rs = stmt.executeQuery(
				"select Employee_id,Employee_name,Employee_Contact_No,Employee_address,Employee_salary,Department_id "
						+ "from Employee_2 inner join Department on Employee_2.Department_id=Department.Department_id where Employee_id="
						+ id);
		if (!rs.next()) {
			throw new IDNotFoundException("Employee Id not Found");
		} else {
			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getDouble(4)
					+ "," + rs.getLong(5) + "," + rs.getInt(6));
		}
	}

	// calculating PF
	public void calculatePF(int id) throws SQLException, IDNotFoundException {
		double salary = 0;
		Connection conn = Helper1.con();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select Employee_salary from Employee_2 where Employee_id=" + id);
		if (!rs.next()) {
			throw new IDNotFoundException("Employee Id not Found");
		} else {
			salary = rs.getDouble(1);
			if (salary >= 1000 && salary <= 10000) {
				System.out.println("Employee PF amount is : " + (salary * 5) / 100);
			} else if (salary > 10000 && salary <= 100000) {
				System.out.println("Employee PF amount is : " + (salary * 6) / 100);
			} else if (salary > 100000) {
				System.out.println("Employee PF amount is : " + (salary * 7) / 100);
			}
		}
	}

}
