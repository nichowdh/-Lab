import java.util.ArrayList;

public class ListLoader { // main calss
	ArrayList<Integer> a = new ArrayList<Integer>(); // array integer

	void loadList(Integer startNumber, Integer lastNumber) { // method loadList
		for (int i = startNumber; i < lastNumber; i++) { // for loop
			a.add(i);
		}
	}

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		ListLoader l = new ListLoader(); // object creation
		int s_time = (int) System.currentTimeMillis();
		l.loadList(1, 10000000); // passing the values
		int e_time = (int) System.currentTimeMillis();
		System.out.println("the time taken for the method to run: " + (e_time - s_time) + " ms ");

	}

}
