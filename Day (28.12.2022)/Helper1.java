package com.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Helper1 { // helper class
	static {
		try {
			// register driver step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// build connection
	public static Connection con() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/niladri_db", "root", "Niladri@1993");
	}

}
