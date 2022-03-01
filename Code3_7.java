package sukkiri_practice;

import java.util.ArrayList;
import java.util.List;

public class Code3_7 {

	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>();

		heroes.add(new Hero("toro", 100, 20));
		heroes.add(new Hero("kurinri", 150, 5));
		heroes.add(new Hero("teri", 300, 100));
		heroes.add(new Hero("kuraudo", 200, 50));

		/*
		heroes.get(0).heroMudo();
		heroes.get(1).heroMudo();
		*/
		heroes.get(2).heroMudo();


		// Streamを利用することで拡張forなどを使わず、1行に処理をまとめられる
		boolean KO = heroes.stream().anyMatch(h -> h.getHp() == 0);

		if(KO == true) {
			System.out.println("祈りを捧げる");
		} else {
			System.out.println("冒険の書を記録する");
		}
	}

}
