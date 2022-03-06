package sukkiri_practice;

import java.util.Iterator;
import java.util.Properties;

public class Code4_3 {

	public static void main(String[] args) {

		// JVMやOSに関する情報を取り出すことができる

		System.out.println("利用中のJavaバージョン: ");
		System.out.println(System.getProperty("java.version"));

		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("システムプロパティ一覧");
		while(i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}

	}

}
