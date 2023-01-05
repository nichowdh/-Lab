package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cms.Helper1;

public class FeeStu {
	long db_id;
	int db_pass;
	double p_fee;
	Scanner sc = new Scanner(System.in);

// deposit Acc. balance to the database
	public void feesStudent(long stu_id, int pass) throws SQLException {
		Scanner sc = new Scanner(System.in);
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

			System.out.println("Enter the amount you want to Donate: ");
		double depo = sc.nextDouble();
		ResultSet rs1 = stmt
				.executeQuery("select fees from College where stu_id= " + stu_id + " and password= " + pass);
		while (rs1.next()) {
			p_fee = rs1.getDouble(1);
			System.out.println();
			System.out.println("Your previous Fund was: " + p_fee);
		}
		stmt.executeUpdate("update College set fees= " + (p_fee + depo) + " " + " where password= " + pass);
		System.err.println("your new balance is: " + (p_fee + depo));
		System.err.println("___________");

	}

}
