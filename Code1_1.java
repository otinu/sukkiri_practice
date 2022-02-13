package sukkiri_practice;

public class Code1_1 {
	public static void main(String[] args) {
		Hero hero = new Hero("クリンリ", 300, 20);
		Hero hero2 = new Hero("クリンリ", 100, 5);
		System.out.println(hero.equals(hero2));
		System.out.println(hero == hero2);
	}
}
