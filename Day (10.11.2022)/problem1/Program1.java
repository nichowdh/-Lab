package problem1;

//Write a program which creates a String “Welcome to Java World” and performs the following 
public class Program1 {// calss
	public static void main(String[] args) { // main method

		String s1 = "Welcome to Java World";
		char ch = s1.charAt(5); // find the character at 5th position
		System.out.println("The Character at 5th position is: " + ch);
		System.out.println("Compare: " + s1.compareTo("Welcome")); // comparing the new string
		String s2 = s1.concat("- Let us learn"); // concatinating new string
		System.out.println("After concat:" + s2);
		System.out.println("First occurance index of 'a' is:" + s2.indexOf('a')); // find the first occurance of 'a'
		String s3 = s1.replace('a', 'e'); // replacing the character 'a' with 'e'
		System.out.println("Replace string is: " + s3);
		System.out.println("Substring is: " + s1.substring(4, 11));
		System.out.println("updated String after lower case: " + s1.toLowerCase()); // converting to the lowercase

	}

}
