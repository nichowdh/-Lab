import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class Problem4 { // class

	public static void main(String[] args) { // main method
		try {
			FileInputStream f = new FileInputStream("E:\\test1.txt"); // destination
			byte arr[] = f.readAllBytes();
			ByteArrayInputStream b = new ByteArrayInputStream(arr);
			int i = 0;
			while ((i = b.read()) != -1) {
				System.out.print((char) i); // convert it to character
			}
			f.close();
			b.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
