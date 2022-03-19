package sukkiri_practice;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Code6_6 {

	public static void main(String[] args) throws IOException {
		String msg = "第一土曜日は資源ゴミの回収です";
		Reader sr = new StringReader(msg);
		System.out.println((char)sr.read());
		System.out.println((char)sr.read());
	}

}
