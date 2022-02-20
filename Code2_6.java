package sukkiri_practice;

public class Code2_6 {

	public static void main(String[] args) {

		Pocket<String> p = new Pocket<>();
		p.put("1192");
		System.out.println(p.get());

		// ジェネリクスによって、フィールドもStringになっている
		System.out.println(p.get().getClass());

		/* 基本データ型の指定や配列生成は不可
		Pocket<int> bad = new Pocket<>();
		Pocket<String> bad2[] = {"Hello", "World"};
		*/
	}

}
