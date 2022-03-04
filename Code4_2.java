package sukkiri_practice;

import java.io.IOException;

public class Code4_2 {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("C:\\Windows\\System32\\notepad.exe", "C:\\Users\\福田哲也\\Desktop\\test.txt");

		pb.start();
	}

}
