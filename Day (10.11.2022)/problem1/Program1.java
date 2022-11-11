package problem1;

//Write a program which creates a String “Welcome to Java World” and performs the following 
public class Program1 {
	public static void main(String[] args) {

		String s1 = "Welcome to Java World";
		char ch = s1.charAt(5);
		System.out.println("The Character at 5th position is: " + ch);
		System.out.println("Compare: " + s1.compareTo("Welcome"));
		String s2 = s1.concat("- Let us learn");
		System.out.println("After concat:" + s2);
		System.out.println("First occurance index of 'a' is:" + s2.indexOf('a'));
		String s3 = s1.replace('a', 'e');
		System.out.println("Replace string is: " + s3);
		System.out.println("Substring is: " + s1.substring(4, 11));
		System.out.println("updated String after lower case: " + s1.toLowerCase());

	}

}
