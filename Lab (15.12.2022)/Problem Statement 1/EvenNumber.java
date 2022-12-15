package collection;

import java.util.ArrayList;

public class EvenNumber { // class
	ArrayList<Integer> a1 = new ArrayList<Integer>(); // taking array list

	ArrayList<Integer> saveEvenNumbers(int N) { // saveEvenNumbers()Method
		a1 = new ArrayList<Integer>();

		for (int i = 2; i <= N; i++) { // for loop
			if (i % 2 == 0)
				a1.add(i);
		}

		return a1;
	}

	ArrayList<Integer> printEvenNumbers() { // printEvenNumber() method
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		for (int i : a1) { // for each loop
			a2.add(i * 2);
			System.out.println(i * 2);
		}

		return a2;
	}

	int retriveEvenNumbers(int N) {

		if (a1.contains(N)) { // contains() method
			return N;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) { // main method
		EvenNumber ob = new EvenNumber(); // object creation
		ob.saveEvenNumbers(10); // passing values
		ob.printEvenNumbers();
		System.out.println("Number is: " + ob.retriveEvenNumbers(8));

	}
}
