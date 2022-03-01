package sukkiri_practice;

import java.util.function.IntToDoubleFunction;

public class Extend3_4 {

	public static void main(String[] args) {

		// ラムダ式の外側で定義
		double b = 3.14;

		IntToDoubleFunction func = (x) -> {
			return x * x * b; // ラムダ式の内側で呼び出し ⇒ 変数bをクロージャと呼ぶ
		};

		System.out.println(func.applyAsDouble(2));
	}

}
