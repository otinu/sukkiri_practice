package sukkiri_practice;

import java.util.function.IntToDoubleFunction;

public class Extend3_4 {

	public static void main(String[] args) {
		double b = 3.14;
		IntToDoubleFunction func = (x) -> {
			return x * x * b;
		};

		System.out.println(func.applyAsDouble(2));
	}

}
