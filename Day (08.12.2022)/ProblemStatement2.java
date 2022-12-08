//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

public class ProblemStatement2 { // class

	public static void main(String[] args) { // main mehtod
		// Taking Aray List
		List<String> a1 = new ArrayList<String>();
		// inserting in the array
		a1.add("Red");
		a1.add("Blue");
		a1.add("Orange");
		a1.add("White");
		a1.add("Black");
		// printing current list
		System.out.println("Current Color list is: " + a1);
		// printing updated list using subList() method
		System.out.println("Updated Color List is:" + a1.subList(0, 3));

	}

}
