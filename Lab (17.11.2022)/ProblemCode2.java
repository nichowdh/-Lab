import java.util.Scanner;

public class ProblemCode2 { // class

	public static void main(String[] args) { // main method
		int x, y; // integer value
		Scanner sc = new Scanner(System.in); // user input
		System.out.println("Enter 2 numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		try {
			if (x < 0 || y < 0) { // if condition
				System.out.println("Exception Occure");
			} else
				System.out.println(x * y);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
