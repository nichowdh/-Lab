
//Write a Java program to update specific array element by given element.

import java.util.ArrayList;
import java.util.List;

public class ProblemStatement1 { // class

	public static void main(String[] args) { // main method
		// Taking Array List
		List<String> a1 = new ArrayList<String>();
		// inserting in the array
		a1.add("Red");
		a1.add("Blue");
		a1.add("Green");
		a1.add("Black");
		// printing current list
		System.out.println("Current Color List is: " + a1);
		a1.add(2, "Yellow");
		// printing updated list
		System.out.println("Updated Color list is: " + a1);

	}

}
