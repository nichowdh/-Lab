package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cms.Helper1;

public class CloseStu {
	int db_pass;
	long db_id;

	public void closeStudent(long stu_id, int pass) throws SQLException {

		Connection conn = Helper1.con();
		Statement stmt = conn.createStatement(); // create statement
		ResultSet rs = stmt.executeQuery("select * from College where stu_id=" + stu_id + " and password =" + pass);
		while (rs.next()) {
			db_id = rs.getLong(1);
			db_pass = rs.getInt(7);
		}
		if (db_id != stu_id) {
			System.err.println("!! WRONG STUDENT ID INSERTED !!");
		} else

			stmt.executeUpdate("delete  from College where stu_id=" + stu_id + " and password= " + pass);
		System.out.println("___STUDENT RECORD CLOSED___");

	}

}
