package sukkiri_practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class Code7_6 {

	public static void main(String[] args) throws IOException {
		Writer fw = new FileWriter("rpgsave.properties");
		Properties p = new Properties();
		p.setProperty("heroName", "クリンリ");
		p.setProperty("heroHp", "55");
		p.setProperty("heroMp", "0");

		// ファイル保存
		p.store(fw, "勇者の情報");	// 第二引数が対象ファイルの先頭にコメントとして出力される
	}

}
