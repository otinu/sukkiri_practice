package sukkiri_practice;

import java.util.function.BiFunction;

public class Extend3 {

	public static void main(String[] args) {

		// BitFunctionは引数を2つ受け取り、戻り値を一つ返す
		BiFunction<String, String, String> func = (str1, str2) -> str1 + str2;
		System.out.println(func.apply("Hello ", "World"));
	}
}
