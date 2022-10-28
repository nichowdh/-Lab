package com.cognizant.tax;

// Problem 1: develop a tax calculator for calculating tax 
public class EmployeeTax { // main class
	public static void main(String[] args) { // main class
		// object creation
		TaxCalculator obj = new TaxCalculator();
		obj.calculateTax();
		obj.deductTax();
		obj.validateSalary();
	}

}
