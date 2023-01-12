package com.BankingManagement;

import java.util.Scanner;

import com.BankingManagement.daoimpl.BankDaoImpl;

//Banking management system
public class App {
	public static void main(String[] args) {
		BankDaoImpl dao = new BankDaoImpl();
		char c;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"PRESS 1 for add Bank Customer \nPRESS 2 for display Customer Details \nPRESS 3 for Deposite to Account \nPRESS 4 for Withdraw From Account \nPRESS 5 for PIN Change \nPress 6 for Close Customer's Acount From Bank");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				dao.openAccount();
				break;
			case 2:
				dao.fetchAccount();
				break;
			case 3:
				dao.depAccount();
				break;
			case 4:
				dao.withAccount();
				break;
			case 5:
				dao.pinChange();
				break;
			case 6:
				dao.closeAccount();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("INVALID CHOICE");
			}
			System.out.println("Do you Want to Continue ? Y/N");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');
		System.out.println("___Thank You___");
	}
}
