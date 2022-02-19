package sukkiri_practice;

public class Sword implements Cloneable {
	String swordName;
	Sword() {
	}
	Sword(String name) {
		swordName = name;
	}

	public Sword clone() {
		Sword result = new Sword();
		result.swordName = this.swordName;
		return result;
	}
}
