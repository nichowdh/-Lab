public class ProblemCode3 {// class
	void addTwoPositive(int a, int b) throws ArithmeticException { // method
		try {
			if (a < 0 && b < 0) { // if condition
				throw new ArithmeticException("Non-positive integer sent");
			} else { // else condition
				System.out.println("The sum of two number is " + (a + b));
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Final Execution ");
		}
	}

	public static void main(String[] args) {// Main method
		ProblemCode3 obj = new ProblemCode3(); // object creation
		obj.addTwoPositive(-10, 20); // passing the value
	}
}
