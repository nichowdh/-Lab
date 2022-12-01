// 1.implement inter thread communication by creating banking methods like deposits & withdrawal
class Customer { // calss
	int amount = 1000;

	synchronized void deposite(int amount) {
		System.out.println("please deposite amount..." + amount);
		this.amount += amount;
		System.out.println("Deposite successfull");
		System.out.println("Current Amount is: " + this.amount);
		notify();
	}

	synchronized void withdraw(int amount) {
		System.out.println("Please withdraw amount..." + amount);
		if (this.amount < amount) {
			System.out.println("Waiting for the deposite..");
			try {
				wait();
			} catch (Exception e) {

			}
		}
		this.amount -= amount;
		System.out.println("Withdrawal Complete");
		System.out.println("Current balance is: " + this.amount);
		notify();
	}
}

public class BankingThread { // main class
	public static void main(String[] args) { // main method
		Customer c = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				c.deposite(10000);
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				c.withdraw(1500);
			}
		};
		t2.start();

	}

}
