import java.util.Scanner;

public class ProblemCode2 { // class

	public static void main(String[] args) throws Exception { // main method
		int x, y; // integer value
		Scanner sc = new Scanner(System.in); // user input
		System.out.println("Enter 2 numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		try {
			if ((x >= -20 || y <= 20) && (x < 0 || y < 0)) { // if condition
				throw new Exception("X & Y should not be zero");
			} else
				System.out.println("Product: " + x * y);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
