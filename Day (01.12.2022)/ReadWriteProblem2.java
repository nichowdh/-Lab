
//create a java program to read n print the content to/from the file
//Note: display two options 1 for store data 2 for print data,
//if user press 1 then read the data from console and store it in file, 
//if user press 2 print the data from the file
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ReadWriteProblem2 { // class
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 or 2 ");
		int ab = sc.nextInt();

		try {
			if (ab == 1) {

				FileOutputStream fout = new FileOutputStream("D:\\test.txt"); // write
				String str = "My name is Niladri ";
				byte arr[] = str.getBytes(); // changing string to byte
				fout.write(arr); // write inside the blank file
				fout.close();
			} else if (ab == 2) {
				FileInputStream fin = new FileInputStream("D:\\test.txt"); // Read
				int i = 0;
				while ((i = fin.read()) != -1) {
					System.out.print((char) i); // converting to characters
				}
				fin.close();
			} else {
				System.out.println("Invalid choice");
			}

			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
