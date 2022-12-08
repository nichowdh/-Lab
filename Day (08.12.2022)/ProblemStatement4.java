//Write a Java program to test an array list is empty or not.

import java.util.ArrayList;
import java.util.List;

public class ProblemStatement4 { // class

	public static void main(String[] args) { // Main method
		// Taking Array List
		List<String> a1 = new ArrayList<String>();
		// inserting in the array
		a1.add("Red");
		a1.add("Green");
		a1.add("Black");
		a1.add("White");
		a1.add("Pink");
		// printing 1st color list
		System.out.println("Color List is: " + a1);
		System.out.println("Color list is not Empty: " + a1.isEmpty());// isEmpty method
		a1.removeAll(a1); // removeAll() method
		System.out.println("Color list is Empty: " + a1.isEmpty());

	}

}
