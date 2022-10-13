package com;

/*•	Implement Inheritance in your program
•	Apply method overriding concept in inheritance*/
public class InheritanceActivity {
	public static void main(String[] args) {
		// object creation and pass the value
		Manager MGR = new Manager(126534, "Peter", "ChennaiIndia", (long) 237844, 65000);
		MGR.calculateSalary();
		Trainee T = new Trainee(29846, "Jack", "Mumbai India", (long) 442085, 45000);
		T.calculateSalary();
		MGR.calculateTransportAllowance();
		T.calculateTransportAllowance();
	}

}
