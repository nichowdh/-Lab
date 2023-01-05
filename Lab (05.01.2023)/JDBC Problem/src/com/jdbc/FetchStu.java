package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cms.Helper1;

public class FetchStu {
	long db_id;
	int db_pass;

	public void fetchStudentDetails(long stu_id, int pass) throws SQLException {
		Connection conn2 = Helper1.con();
		Statement stmt = conn2.createStatement(); // create statement
		// execute query fetch data from database
		ResultSet rs = stmt.executeQuery("select * from College where stu_id=" + stu_id + " and password =" + pass);
		// iteration
		while (rs.next()) { // getting the column of each record of table
			db_id = rs.getLong(1);
			db_pass = rs.getInt(7);

		}
		if (db_id != stu_id) {
			System.err.println("!! WRONG STUDENT ID INSERTED !!");
		}

		else {
			System.err.println("____________________________");
			System.out.println("__Details of Student__");
			ResultSet rs1 = stmt.executeQuery("select * from College where password =" + pass);
			while (rs1.next()) {
				System.err.println("Student ID: " + rs1.getLong(1) + "\nStudent First Name: " + rs1.getString(2)
						+ "\nStudent Last Name: " + rs1.getString(3) + "\nDepartment: " + rs1.getString(4)
						+ "\nStudent Type: " + rs1.getString(5) + "\nFees Balance: " + rs1.getDouble(6) + "\nPassword: "
						+ rs1.getInt(7));
				System.err.println("Data inserted & saved successfully------------------");
			}
		}

	}

}
