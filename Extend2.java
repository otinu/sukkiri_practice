package sukkiri_practice;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Extend2 {

	public static void main(String[] args) {

		// ①=================================================================

		// OptionalクラスはofNullableで生成
		Optional<String> op1 = Optional.ofNullable("Hello");
		Optional<String> op2 = Optional.ofNullable(null);
		Optional<Integer> op3 = Optional.ofNullable(7);

		// new演算子でインスタンス生成は不可
		// Optional<String> op3 = new Optional();

		// 引数なしでも生成不可
		// Optional<String> op4 = Optional.ofNullable();

		// 処理効率の観点から、ラッパークラスとは別のクラスが用意されている。
		OptionalInt optionalInt = OptionalInt.of(1);
		OptionalLong optionalLong = OptionalLong.of(10L);
		OptionalDouble optionalDouble = OptionalDouble.of(10.0);

		// ②=================================================================

		// isPresent() は中身がnullのときはfalseを返す
		System.out.println(op1.isPresent());
		System.out.println(op2.isPresent());

		// ③=================================================================

		// get()で要素の取り出しが可能
		// 要素がnullの場合はNoSuchElementException 発生
		System.out.println(op1.get());
		// System.out.println(op2.get());
		System.out.println(op3.get());

		// ④=================================================================

		// orElse() は中身がnullのときに取り出す要素の内容を指定した引数に変更して返す
		System.out.println(op1.orElse("nullのため、orElse()の引数を表示しました"));
		System.out.println(op2.orElse("nullのため、orElse()の引数を表示しました"));
	}

}
