//Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.List;

public class ProblemStatement3 { // class

	public static void main(String[] args) { // main method
		// Taking first Array List
		List<String> a1 = new ArrayList<String>();
		// inserting in the array
		a1.add("Red");
		a1.add("Green");
		a1.add("Black");
		a1.add("White");
		a1.add("Pink");
		// printing 1st color list
		System.out.println("First Color List is: " + a1);
		// Taking seocond array List
		List<String> a2 = new ArrayList<String>();
		// inserting in the array
		a2.add("Red");
		a2.add("Green");
		a2.add("Black");
		a2.add("Pink");
		// printing 2nd color list
		System.out.println("Second Color List is: " + a2);
		// taking third Array List to store the comapred value of 2 Array List
		List<String> a3 = new ArrayList<String>();
		{
			for (String s : a1) // for each loop
				a3.add(a2.contains(s) ? "yes" : "No"); // compare using contains() method
			System.out.println("After Comparing 2 Color List");
			System.out.println(a3);
		}

	}

}
