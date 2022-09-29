/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by 
both. */

public class Divisible {
	public static void main(String[] args) {
		int i; // taking a integer
		for (i = 1; i < 100; i++) { // applying for loop
			if (i % 3 == 0) // condition
				System.out.println("numbers divisible by 3 are: " + i); // output for divisibe by 3
		}

		for (i = 1; i < 100; i++) { // applying for loop
			if (i % 5 == 0) // condition
				System.out.println("number divisibel by 5 are: " + i); // output for divisibe by 5
		}

		for (i = 1; i < 100; i++) { // applying for loop
			if (i % 3 == 0 && i % 5 == 0) // condition
				System.out.println("numbers divisible by both 3 & 5 are: " + i); // output for divisibe by 3 & 5
		}
	}

}
