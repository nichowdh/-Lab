package com.Spring.entity;

public class Account { // class
	private String type;
	private double balance;

	public Account(String type, double balance) { // parameterized constructor
		super();
		this.type = type;
		this.balance = balance;

	}

	public String toString() { // to string method

		return type + " " + balance;
	}

}
