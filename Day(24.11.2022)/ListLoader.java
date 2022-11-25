import java.util.ArrayList;

public class ListLoader implements Runnable { // class
	int startNumber, lastNumber;

	ListLoader(int sn, int ln) { // parameterised constructor
		this.startNumber = sn;
		this.lastNumber = ln;
	}

	public void run() { // method of (loadlist)
		ArrayList<Integer> a = new ArrayList<Integer>(); // array integer
		for (Integer i = startNumber; i < lastNumber; i++) { // for loop
			a.add(i);
		}
		for (int j : a) { // for loop
			System.out.println(j);
		}

	}

	public static void main(String[] args) throws InterruptedException { // main method
		Runnable r = new ListLoader(0, 100); // object creatio of Runnable with value
		Thread t = new Thread(r); // object of Thread Class
		int a = (int) System.currentTimeMillis(); // time taken before executing
		System.out.println("Response time before Executing LoadList Method: " + a);
		t.start();
		t.join();
		int b = (int) System.currentTimeMillis();
		System.out.println("Response time after Executing LoadList Method: " + b);
		System.out.println("Response Time: " + (b - a) + " ms");
	}

}
