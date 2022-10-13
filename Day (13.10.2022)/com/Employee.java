package com;

public class Employee { // class
	long empId, empPhone;
	String empName, empAddress;
	double basicSalary;
	static double specialAllowance = 250.80;
	static double Hra = 1000.50;

	Employee(long id, String Name, String Address, long Phone) { // constructor
		id = empId;
		Name = empName;
		Address = empAddress;
		Phone = empPhone;
	}

	void calculateSalary() { // 1st method
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		System.out.println("The salary is: " + salary);
	}

	public void calculateTransportAllowance() { // 2nd method
		double transportAllowance = 10 * basicSalary / 100;
		System.out.println("The transportAllowance is: " + transportAllowance);
	}
}
