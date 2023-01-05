package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cms.Helper1;

public class CreatStu {
	long db_id, stu_id;
	int pass, db_pass;
	double fees;
	String f_name, l_name, dept, stu_type;
	Scanner sc = new Scanner(System.in);

	public void createStudentDetails(long stu_id, int pass) throws SQLException {
		Connection conn = Helper1.con();
		Statement stmt = conn.createStatement();

		// execute query fetch data from database
		ResultSet rs = stmt.executeQuery("select * from College where stu_id=" + stu_id + " and password =" + pass);
		while (rs.next()) {
			db_id = rs.getLong(1);
			db_pass = rs.getInt(7);
		}
		if (db_id == stu_id) {
			System.err.println(" !! Student Already Exist !!");
		}

		else {

			System.out.println("Enter Student First name: ");
			f_name = sc.next();

			System.out.println("Enter Student Last name: ");
			l_name = sc.next();

			System.out.println("Enter Department: ");
			dept = sc.next();

			System.out.println("Enter Student Type: ");
			stu_type = sc.next();

			System.out.println("Enter Fees Balance: ");
			fees = sc.nextDouble();

			PreparedStatement stmt1 = conn.prepareStatement("insert into College values(?,?,?,?,?,?,?)");
			stmt1.setLong(1, stu_id);
			stmt1.setString(2, f_name);
			stmt1.setString(3, l_name);
			stmt1.setString(4, dept);
			stmt1.setString(5, stu_type);
			stmt1.setDouble(6, fees);
			stmt1.setInt(7, pass);

			stmt1.executeUpdate(); // execute
			System.err.println("_______NEW STUDENT RECORD CREATED_______");
		}
	}

}
