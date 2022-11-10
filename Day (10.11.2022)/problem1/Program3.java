package problem1;
//Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.

//Drive: c:\

import java.util.StringTokenizer;

public class Program3 {
	public static void show() {
		StringTokenizer str = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		while (str.hasMoreTokens()) { // boolean method to checks if there is more token availale or not
			System.out.println(str.nextToken("\\"));
			StringTokenizer str1 = new StringTokenizer(" ");
			while (str1.hasMoreTokens()) {// String method, its returns the next token from String tokenizer
				// object
				System.out.println();
				System.out.println(str1.nextToken("||"));
			}
		}
	}

	public static void main(String[] args) {
		show();
	}

}
