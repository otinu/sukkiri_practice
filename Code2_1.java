package sukkiri_practice;

public class Code2_1 {

	public static void prints(Object a, Object b) {
		for(int i = 0; i < (Integer)b; i++) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {

		// 全てのオブジェクトの型をObject型にして、必要に応じてキャストすれば動かすことはできる。
		Object s = "Hello World";
		s = new Hero("クリンリ", 300, 20);
		Sword weapon = new Sword("ナックル");
		((Hero)s).setSword(weapon);
		Object n = 1;
		prints(s, n);

		// エラー警告は表示されず、実行するまで例外に気づけない
		n = "Hello Java";
		prints(s, n);

	}

}
