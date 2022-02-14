package sukkiri_practice;

import java.util.Arrays;

public class Code1_4 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};

		// Arraysのequalsメソッドを使用
		System.out.println("誤った判定: " + a.equals(b));
		System.out.println("正しい判定:" + Arrays.equals(a, b));
	}

}
