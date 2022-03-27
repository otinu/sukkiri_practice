package sukkiri_practice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Code7_5 {

	public static void main(String[] args) throws IOException {
		Reader fr = new FileReader("rpgdata.properties");
		Properties p = new Properties();
		p.load(fr);

		// プロパティファイルの読み込みでは、すべてのデータは文字列として扱う
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");

		int hp = Integer.parseInt(strHp);
		System.out.println("勇者の名前:" + name);
		System.out.println("勇者のHP" + hp);
		fr.close();
	}

}
