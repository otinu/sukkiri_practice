package sukkiri_practice;

import java.util.ResourceBundle;

public class Code7_7 {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("jp.miyabilink.rpg.rpgdata");
		String heroName = rb.getString("heroName");
		System.out.println("勇者の名前" + heroName);
	}

}
