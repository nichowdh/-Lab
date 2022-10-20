import java.util.Scanner;

//Write a Java method to check whether every digit of a given integer
//is even. Return true if every digit is odd otherwise false?
public class Even_Odd_Method { // class
	static int n; // defining variables

	public static boolean evenodd(int n) { // method
		final int f = 10;
		if (n == 0) { // iff loop
			return false;
		}
		while (n != 0) { // while loop
			if ((n % f) % 2 != 0) { // if loop
				return false;
			}
			n /= 10;
		}
		return true; // checking whether its true or false
	}

	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in);// using scanner input
		System.out.println("Enter the digit: ");
		n = sc.nextInt();
		System.out.println("Checking the Digit is even or odd ");
		System.out.println(evenodd(n)); // calling the method
	}
}
