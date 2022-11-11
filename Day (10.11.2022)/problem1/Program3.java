package problem1;
//Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.

public class Program3 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		System.out.println("Drive:" + str.substring(0, 3));
		System.out.println("Folder:" + str.substring(3, 6).concat("||") + str.substring(7, 10).concat("||")
				+ str.substring(11, 18));
		System.out.println("File:" + str.substring(20));

	}
}
