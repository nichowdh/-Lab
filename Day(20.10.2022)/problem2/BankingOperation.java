package problem2;

//Banking Operations relate Problem

class BankOp { // class
	// data variables
	private int accountNumber, accountBalance;
	private String accountName;
	int Amount = 500, addAmount, widAmount;

	// 1st constructor
	public BankOp(int accountNumber, String accountName, int accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public void createAccount() { // 1st method
		System.out.println(
				"Acc_No: " + accountNumber + " " + "Acc_Name: " + accountName + " " + "Acc_Bal: " + accountBalance);
	}

	public void setAmount() { // 2nd method
		addAmount = accountBalance + Amount;
		System.out.println("Total Amount: " + addAmount);
	}

	public void getAmount() { // 3rd method
		System.out.println("Acc_Bal: " + accountBalance + " " + "Acc_Name: " + accountName);
	}

	public void withDrawAmount() { // 4th method
		int widAmount = accountBalance - Amount;
		System.out.println("Current_Amount: " + widAmount);
	}

}

public class BankingOperation { // main class
	public static void main(String[] args) { // main class
		// creating 1st Cust. object
		BankOp b = new BankOp(25, "Niladri", 10000);
		b.createAccount();
		b.setAmount();
		b.getAmount();
		b.withDrawAmount();
		// creating 2nd cust. object
		BankOp b1 = new BankOp(52, "Soumya", 20000);
		b1.createAccount();
		b1.setAmount();
		b1.getAmount();
		b1.withDrawAmount();
	}

}
