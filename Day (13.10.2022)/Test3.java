//Q.3 Develop a public java class and make sure nobody can create any 
//object of this class from outside the class
public class Test3 { // 1st class
	private Test3() {
		System.out.println("Private ");
	}

	public static void main(String[] args) {
		Test3 t = new Test3(); // creating object

	}

}
