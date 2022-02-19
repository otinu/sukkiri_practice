package sukkiri_practice;

public class Code1_11 {

	public static void main(String[] args) {
		Hero hero = new Hero("クリンリ", 300, 20);
		Sword weapon = new Sword("ナックル");

		hero.setSword(weapon);
		System.out.println(hero);

		// ここでNullPointerException
		//	⇒Swordクラスにclone()メソッドを定義することで解決
		Hero hero2 = hero.clone();
		System.out.println(hero2);

		hero.setSword(new Sword("鋼のナックル"));
		System.out.println(hero2);
	}

}
