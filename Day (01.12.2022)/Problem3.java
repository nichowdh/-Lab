import java.io.FileInputStream;
import java.io.IOException;

public class Problem3 { // class
	public static void main(String[] args) throws IOException { // main method

		try {
			FileInputStream fin = new FileInputStream("E:\\test1.txt"); // destination
			byte filout[] = new byte[1024];
			int i = 0;
			while ((i = fin.read(filout)) > 0) { // converting the byte array
				System.out.println(new String(filout, 0, i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
