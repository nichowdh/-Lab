//print the elements of the array which are present in odd positions.
//This can be accomplished by looping through the array and printing the 
//elements of an array by incrementing i by 2 till the end of the array is reached.
//In the above array, the elements present on odd positions are a, c and e

public class PresentInOddPosition {// class
	public static void main(String[] args) { // main method
		String[] arr = { "a", "b", "c", "d", "e" }; // defining & initialize the array
		// for loop printing the elements of an array by incrementing i by 2 till the
		// end of the array is reached
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println("Present in odd positions are: " + arr[i]);
		}

	}

}
