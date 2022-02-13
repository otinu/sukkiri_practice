package sukkiri_practice;

public class Hero {
	private String name;
	private int hp;
	private int mp;

	Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public String toString() {
		return ("勇者(名前=" + this.name + " HP=" + this.hp + " MP=" + this.mp + ")");
	}

	public boolean equals(Object o) {
		if(o == this) return true;	// 自分自身の比較はtrue
		if(o == null) return false;
		if(!(o instanceof Hero)) return false;	// Hero型以外の型であればfalse
		Hero h = (Hero)o;
		if(!this.name.equals(h.name)) {
			return false;
		}
		return true;
	}
}
