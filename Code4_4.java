package sukkiri_practice;

public class Code4_4 {

	public static void main(String[] args) {

		// システムプロパティを設定・変更することも可能
		//  ⇒不具合の原因になる可能性があるため、積極的に使うべきではない
		System.setProperty("rpg.version", "0.3");
		String ver = System.getProperty("rpg.version");

		System.out.println(ver);
	}

}
