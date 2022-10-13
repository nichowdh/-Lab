package com;

public class Manager extends Employee {

	Manager(long Id, String Name, String address, Long phone, double salary) { // constructor
		super(Id, Name, address, phone);
		super.basicSalary = salary;

	}

	public void calculateTransportAllowance() { // method
		double transportAllowance = 15 * basicSalary / 100;
		System.out.println("Manager transportAllowance is: " + transportAllowance);
	}

}
