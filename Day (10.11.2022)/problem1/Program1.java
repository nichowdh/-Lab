package problem1;

//Write a program which creates a String “Welcome to Java World” and performs the following 
public class Program1 {
	String s1 = "Welcome to Java World";
	String s2 = "Welcome";

	void show() { // method 1, to check 5th position
		char ch = s1.charAt(5);
		System.out.println("The Character at 5th position is: " + ch);
	}

	void display() { // 2nd method, to compare lexographically
		if (s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	void concat() { // 3rd method to concat
		s1 = s1.concat("- Let us learn");
		System.out.println(s1);
	}

	void index() {// 4th method to define 1st occurance of a
		int i = s1.indexOf("a");
		System.out.println("First occurance of 'a' is: " + i);
	}

	void replace() { // 5th method to rplace 'a', with 'e'
		String j = s1.replaceAll("a", "e");
		System.out.println("Updated String is: " + j);
	}

	void substring() { // 6th method to Returns string between 4th position and 10th position and
						// display it
		System.out.println("Substring is: " + s1.substring(4, 10));
	}

	void lowercase() {// 7th method to Returns the lowercase of the string and display it
		System.out.println("Updated string after lowercase: " + s1.toLowerCase());
	}

	public static void main(String[] args) { // main methods
		Program1 obj = new Program1(); // object creation
		obj.show(); // calling 1st method
		obj.display();// calling 2nd method
		obj.concat();// calling 3rd method
		obj.index();// calling 4th method
		obj.replace();// calling 5th method
		obj.substring();// calling 6th method
		obj.lowercase();// calling 7th method
	}
}
