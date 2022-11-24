//Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print
public class EvenOddThread extends Thread { // main class

	public void run() { // method run()
		for (int i = 1; i <= 100; i++) { // for loop
			try {
				if (i % 2 == 0) { // checking the condition of even value
					System.out.println(" Even numbers: " + i + " ");
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

	public static void main(String[] args) { // main method
		// object creation
		EvenOddThread t = new EvenOddThread();
		EvenOddThread t1 = new EvenOddThread();
//calling the ojject and using the join method
		t1.start();
		for (int i = 1; i <= 100; i++) { // for loop
			try {
				if (i % 2 != 0) { // checking the condition of even value
					System.out.println(" Odd numbers: " + i + " ");
				}
				t.join();
				t1.join();
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

}
