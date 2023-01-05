package com.cms;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.CloseStu;
import com.jdbc.CreatStu;
import com.jdbc.FeeStu;
import com.jdbc.FetchStu;
import com.jdbc.PassChange;

public class CMS {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		int var;
		do {
			System.out.println("""
					->||   Welcome to COLLEGE MANAGEMENT SYSTEM  ||<-

					Press 1 to Create Student Record in College :~
					Press 2 to Show Student Details :~
					Press 3 to Deposit Funds to College :~
					Press 4 to Change your Password  :~
					Press 5 to Close Student Record :~
					Press 6 to  Exit :~

					""");
			var = sc.nextInt();
			System.out.println("__________________");
			switch (var) {
			case 1:
				System.out.println("Enter Digits to create  New Student Details: ");
				long stu_id = sc.nextLong();
				System.out.println("Enter 4 digit to create a new Password");
				int pass = sc.nextInt();
				CreatStu cs = new CreatStu();
				cs.createStudentDetails(stu_id, pass);
				System.err.println("____NEW STUDENT RECORD CREATED____");
				break;
			case 2:
				System.out.println("Enter your Student Id: ");
				long p = sc.nextLong();
				System.out.println("Enter your Password: ");
				int q = sc.nextInt();
				FetchStu sb = new FetchStu();
				sb.fetchStudentDetails(p, q);
				System.out.println();
				break;
			case 3:
				System.out.println("Enter your Student Id: ");
				long a = sc.nextLong();
				System.out.println("Enter your Password: ");
				int b = sc.nextInt();
				FeeStu db = new FeeStu();
				db.feesStudent(a, b);
				System.out.println();
				break;

			case 4:
				System.out.println("Enter your Student Id: ");
				long e = sc.nextLong();
				System.out.println("Enter your current Password: ");
				int f = sc.nextInt();
				PassChange pc = new PassChange();
				pc.passwordChange(e, f);
				System.err.println("____PASSWORD HAS BEEN CHANGED___");
				break;
			case 5:
				System.out.println("Enter your Student Id: ");
				long g = sc.nextLong();
				System.out.println("Enter your current Password: ");
				int h = sc.nextInt();
				CloseStu ca = new CloseStu();
				ca.closeStudent(g, h);
				System.out.println();
				break;
			case 6:
				System.err.println("You have sucessfully logged out");
				System.out.println("___THANK YOU___");
				System.out.println();
				System.exit(0);
				break;

			}
		} while (var > 0 && var < 7);

	}

}
