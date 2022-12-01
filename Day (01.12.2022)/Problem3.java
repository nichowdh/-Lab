import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem3 { // class
	public static void main(String[] args) throws IOException { // main method
		FileOutputStream f = new FileOutputStream("D:\\test.txt"); // destination
		byte arr[] = { 56, 57, 58, 89, 70 };
		ByteArrayInputStream b = new ByteArrayInputStream(arr); // converting to byte
		int i = 0;
		while ((i = b.read()) != -1) {
			f.write(i);
			char ch = (char) i; // storing
			System.out.println(ch);
			b.close();
			f.close();
		}
	}

}
