package sukkiri_practice;

import java.util.HashSet;
import java.util.Set;

public class Code1_6 {

	public static void main(String[] args) {
		Set<Hero> list = new HashSet<>();
		Hero h1 = new Hero("トロ", 100, 10);
		list.add(h1);
		System.out.println("要素数=" + list.size());

		// mpの値が違っても、生成されるハッシュの値が等しい
		h1 = new Hero("トロ", 100, 100000000);
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}

}
