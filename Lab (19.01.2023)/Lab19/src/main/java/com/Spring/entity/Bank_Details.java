package com.Spring.entity;

public class Bank_Details { // class
	private String b_name;
	private String ename;
	private Account acc;

	public Bank_Details() { // default constructor
		System.out.println("Def cons");
	}

	public Bank_Details(String b_name, String ename, Account acc) { // parameterised constructor
		super();
		this.b_name = b_name;
		this.ename = ename;
		this.acc = acc;

	}

	public void display() { // method
		System.out.println(b_name + " " + ename);
		System.out.println(acc.toString());
	}

}
