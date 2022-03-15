package sukkiri_practice;

import java.io.FileWriter;
import java.io.IOException;

public class Code6_1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\temp\\test.txt", true);
		fw.write("A");
		fw.flush();
		fw.close();
	}

}
