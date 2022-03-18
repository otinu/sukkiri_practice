package sukkiri_practice;

import java.io.FileWriter;
import java.io.IOException;

public class Code6_5 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("rpgsave.dat", true);) {
			fw.write("A");
			fw.flush();
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラー");
		}
	}

}
