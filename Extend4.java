package sukkiri_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Extend4 {

	public static void main(String[] args) {

		List<Hero> heroes = new ArrayList<>();

		heroes.add(new Hero("toro", 100, 20));
		heroes.add(new Hero("kurinri", 150, 5));
		heroes.add(new Hero("teri", 300, 100));
		heroes.add(new Hero("kuraudo", 200, 50));

		heroes.get(0).heroMudo();
		heroes.get(1).heroMudo();
		heroes.get(2).heroMudo();

		// collectメソッドが用意されていることで、複数の処理を一つにまとめて(メソッドチェーン)、新しい配列を作ることができる
		List<String> KONames = heroes.stream()
				.filter(h -> h.getHp() == 0)
				.limit(3)
				.map(h -> h.getName())
				.collect(Collectors.toList()); // collectメソッド

		System.out.println(KONames);

	}

}
