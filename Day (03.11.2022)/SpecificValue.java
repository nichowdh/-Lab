import java.util.Scanner;

//Write a Java program to test if an array contains a specific value.

public class SpecificValue { // class
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in); // user input
		int[] arr = { 1789, 2035, 1899, 1456, 2013 }; // declaring the array
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		boolean f = false;
		for (int i = 0; i < arr.length; i++) { // for loop
			if (num == arr[i]) { // if condition
				f = true;
			}
		}
		if (f) { // if condition
			System.out.println("The Number Is Found");
		} else {
			System.out.println("The number Is not Found");
		}
	}
}
