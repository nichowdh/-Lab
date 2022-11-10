package problem1;

//Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
public class Program2 { // class
	public static void main(String[] args) {// main method
		// string buffer
		StringBuffer s = new StringBuffer("This is StringBuffer"); // object of String bufferclass
		s.append("- This is a sample program");
		System.out.println("String is: " + s);
		s.insert(21, "Object");// int off set,string s
		System.out.println("Insert is: " + s);
		s.replace(14, 20, "Builder");// (begienwith, endswith, string s)
		System.out.println("Replace is: " + s);
		s.reverse(); // reversing he whole string
		System.out.println("Reverse is: " + s);

	}
}
