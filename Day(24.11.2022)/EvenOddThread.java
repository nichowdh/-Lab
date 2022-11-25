//Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print

class OddThread extends Thread { // class of odd no.
	public void run() {
		System.out.println("Odd Numbers");
		for (int i = 1; i <= 100; i++) { // for loop
			if (i % 2 != 0) { // checking the condition of even value
				System.out.println(i);
			}
		}
	}
}

class EvenOddThread extends Thread { // main class of even no.

	public void run() { // method run()
		System.out.println("Even No");
		for (int i = 1; i <= 100; i++) { // for loop
			if (i % 2 == 0) { // checking the condition of even value
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) throws InterruptedException { // main method
		// object creation
		OddThread t = new OddThread();
		EvenOddThread t1 = new EvenOddThread();

//calling the object and using the join method
		t1.start();
		t1.join();
		Thread.sleep(50);
		t.start();

	}

}
