package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cms.Helper1;

public class PassChange {
	int db_pass;
	long db_id;
	Scanner sc = new Scanner(System.in);

	public void passwordChange(long stu_id, int pass) throws SQLException {

		Connection conn = Helper1.con();
		Statement stmt = conn.createStatement(); // create statement

		System.out.println("Enter New Password: ");
		int n_pass = sc.nextInt();

		ResultSet rs = stmt.executeQuery("select * from College where stu_id=" + stu_id + " and password =" + pass);
		while (rs.next()) {
			db_id = rs.getLong(1);
			db_pass = rs.getInt(7);
		}
		if (db_id != stu_id) {
			System.err.println("!! WRONG STUDENT ID INSERTED !!");
		} else

			stmt.executeUpdate("update College set password =" + n_pass + " where stu_id= " + stu_id);
		System.out.println("___Password Set SUCCESSFULLY___");

	}

}
