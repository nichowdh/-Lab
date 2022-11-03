//Write a Java program to find the duplicate values of an array of integer values

public class DuplicateValue { // class
	public static void main(String[] args) { // main method
		int[] arr = { 5, 2, 7, 7, 5 }; // initializing and defing the array
		for (int i = 0; i < arr.length - 1; i++) { // for each condition
			for (int j = i + 1; j < arr.length; j++) {// for loop
				if (arr[i] == arr[j] && (i != j)) { // checking the array
					System.out.println("Duplicate Values are: " + arr[j]); // print the output
				}
			}
		}
	}
}
