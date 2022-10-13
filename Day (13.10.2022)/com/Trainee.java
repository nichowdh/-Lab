package com;

public class Trainee extends Employee {

	// Constructor
	public Trainee(long Id, String Name, String address, Long phone, double salary) {
		super(Id, Name, address, phone);
		super.basicSalary = salary;
	}
}
