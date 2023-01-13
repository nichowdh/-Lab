package com.BankingManagement.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.BankingManagement.config.BankUtil;
import com.BankingManagement.dao.BankDao;
import com.BankingManagement.entity.Bank;

public class BankDaoImpl implements BankDao {// open account in db
	public void openAccount() {
		Scanner sc = new Scanner(System.in);
		String acc_holder, ifsc, branch, acc_type;
		long acc;
		int pin;
		double bal;
		System.out.println("_____Enter the Details to create a new Acc______");
		System.out.println("Enter Account Number:");
		acc = sc.nextLong();
		System.out.println("Enter Account Holder Name:");
		acc_holder = sc.next();
		System.out.println("Enter IFSC:");
		ifsc = sc.next();
		System.out.println("Enter Branch");
		branch = sc.next();
		System.out.println("Enter Account Type:");
		acc_type = sc.next();
		System.out.println("Enter Amount:");
		bal = sc.nextDouble();
		System.out.println("Enter Account PIN:");
		pin = sc.nextInt();

		Bank b = new Bank();
		b.setAccount_no(acc);
		b.setAccount_holder(acc_holder);
		b.setIfsc(ifsc);
		b.setBranch(branch);
		b.setAccount_type(acc_type);
		b.setBalance(bal);
		b.setPin(pin);

		Session session = BankUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(b);
		t.commit();

	}

	public void fetchAccount() {// fetch account from db
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		long acc = sc.nextLong();
		System.out.println("Enter Account PIN:");
		int pin = sc.nextInt();
		Session session = BankUtil.getSessionFactory().openSession();
		Bank b1 = session.get(Bank.class, acc);
		System.out.println("__Details of your Account__");
		System.out.println(b1.getAccount_no() + " " + b1.getAccount_holder() + " " + b1.getIfsc() + " " + b1.getBranch()
				+ b1.getAccount_type() + " " + b1.getBalance() + " " + b1.getPin());
		System.err.println("Data inserted & saved successfully------------------");

	}

	public void depAccount() {// deposit to account in db
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		long acc = sc.nextLong();
		System.out.println("Enter Account PIN:");
		int pin = sc.nextInt();
		Session session = BankUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Bank b2 = session.get(Bank.class, acc);
		System.out.println("Enter the amount you want to deposite: ");
		double depo = sc.nextDouble();
		double u_bal = b2.getBalance() + depo;
		b2.setBalance(u_bal);
		session.update(b2);
		System.out.println("Updated Successfully...");
		System.out.println("Previous balance was: " + b2.getBalance());
		System.out.println("Updated balance is: " + u_bal);
		t.commit();

	}

	public void withAccount() {// withdrawal from db

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		long acc = sc.nextLong();
		System.out.println("Enter Account PIN:");
		int pin = sc.nextInt();
		Session session = BankUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Bank b3 = session.get(Bank.class, acc);
		System.out.println("Enter the amount you want to Withdraw: ");
		double with = sc.nextDouble();
		double u_bal = b3.getBalance() - with;
		b3.setBalance(with);
		session.update(b3);
		System.out.println("Withdrawal Successfully...");
		System.out.println("Previous balance was: " + b3.getBalance());
		System.out.println("Updated balance is: " + u_bal);
		t.commit();

	}

	public void pinChange() {// pin change from db
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		long acc = sc.nextLong();
		Session session = BankUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Bank b4 = session.get(Bank.class, acc);
		System.out.println("Enter Current PIN:");
		int pin = sc.nextInt();
		System.out.println("Enter New PIN:");
		int pin1 = sc.nextInt();
		b4.setPin(pin1);
		session.update(b4);
		System.out.println("PIN Change Successfully...");
		t.commit();

	}

	public void closeAccount() {// delete account from db
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		long acc = sc.nextLong();
		System.out.println("Enter Account PIN:");
		int pin = sc.nextInt();
		Session session = BankUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Bank b5 = session.get(Bank.class, acc);
		session.delete(b5);
		System.out.println("Closed Successfully...");
		t.commit();

	}

}
