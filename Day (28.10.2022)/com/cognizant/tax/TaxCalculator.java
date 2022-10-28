package com.cognizant.tax;

public class TaxCalculator { // class
	// instance variables
	float basicSalary = 125000;
	float tax = 30 * (basicSalary / 100);
	boolean citizenship;
	float nettSalary;

	public void calculateTax() { // 1st method
		System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
	}

	public void deductTax() {// 2nd method
		nettSalary = basicSalary - tax;
		System.out.println("The nett salary of the employee " + nettSalary);
	}

	public void validateSalary() { // 3rd method
		if ((basicSalary > 100000) && (citizenship = true)) {
			System.out.println("The Salary and citizenship Eligibility: True");
		} else {
			System.out.println("The salary and citizenship eligibility: False ");
		}

	}

}
