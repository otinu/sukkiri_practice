package sukkiri_practice;

import java.util.function.Function;

public class Code3_2 {

	public static void main(String[] args) {

		// Code3_2クラスのメソッドの【参照】をローカル変数funcに代入
		Function<String, Integer> func = Code3_2::len; // メソッドの後ろに()は付けない

		int a = func.apply("Java");
		System.out.println("文字列「Java」は" + a + "文字です");
	}

	public static Integer len(String s) {
		return s.length();
	}

}
