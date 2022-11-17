class CountryNotValidException extends Exception {
	CountryNotValidException(String str) {
		super(str);
	}
}

class EmployeeNameInvalidException extends Exception {
	EmployeeNameInvalidException(String str) {
		super(str);
	}
}

class TaxNotEligibleException extends Exception {
	TaxNotEligibleException(String str) {
		super(str);
	}
}

public class TaxCalculator { // main class
	double taxAmount;

	public void calculateTax(String empname, boolean isIndian, double empSal) throws Exception { // method
		if (isIndian == false) { // if condition 1
			throw new CountryNotValidException("Employee is an Indian");
		} else if (empname == null) { // if condition 2
			throw new EmployeeNameInvalidException("the employee name cant be empty");

		} else if (empSal > 10000) { // if condition 3
			taxAmount = empSal * 8 / 100;
			System.out.println("Tax amount is: " + taxAmount);
		} else if (empSal > 50000 && empSal < 100000) { // if condition 4
			taxAmount = empSal * 6 / 100;
			System.out.println("Tax amount iS: " + taxAmount);
		} else if (empSal > 30000 && empSal < 50000) { // if condition 5
			taxAmount = empSal * 5 / 100;
			System.out.println("Tax amount iS: " + taxAmount);
		} else if (empSal > 10000 && empSal < 30000) { // if condition 6
			taxAmount = empSal * 4 / 100;
			System.out.println("Tax amount iS: " + taxAmount);
		} else { // else condition
			throw new TaxNotEligibleException("Employee not eligible to pay the tax");
		}
	}

	public static void main(String[] args) throws Exception { // main method
		TaxCalculator t = new TaxCalculator(); // object creation
		t.calculateTax("Ron", false, 34000);// taste case 1
		t.calculateTax("Tim", true, 1000);// taste case 2
		t.calculateTax("Jack", true, 55000);// taste case 3
		t.calculateTax(null, true, 30000);// taste case 4
	}

}
