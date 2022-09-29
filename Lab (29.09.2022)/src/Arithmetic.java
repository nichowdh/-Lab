/*A class named Arithmetic with a method named add that takes integers as 
parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic*/

class Arithmetic1 { // parent class
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

}

class Adder extends Arithmetic1 { // child class

}

public class Arithmetic {
	public static void main(String[] args) {
		// create new object
		Adder A = new Adder();
		// printing the value of super classthrough child class
		System.out.println(A.add(3, 2));

	}
}