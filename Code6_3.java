package sukkiri_practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class Code6_3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\temp\\rpgsave.dat", true);
		fos.write(65);
		fos.flush();
		fos.close();
	}

}
