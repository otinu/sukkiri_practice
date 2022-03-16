package sukkiri_practice;

import java.io.FileReader;
import java.io.IOException;

public class Code6_2 {

	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("test.txt");
		System.out.println("全データを読み込んで表示します");
		int i = fw.read();
		while(i != -1) {
			char c = (char)i;
			System.out.println(c);
			i = fw.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fw.close();
	}

}
