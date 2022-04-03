package sukkiri_practice;

import java.io.Serializable;
import java.util.Objects;

public class Hero extends heroUnit implements Cloneable, Serializable {
	private String name;
	private int hp;
	private int mp;
	Sword sword;

	Hero() {

	}

	Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	void setSword(Sword sword) {
		this.sword = sword;
	}

	public String toString() {
		return ("勇者(名前=" + this.name + " HP=" + this.hp + " MP=" + this.mp + ")" + "\n" + "武器: " + this.sword.swordName);
	}

	public int hashCode() {
		return Objects.hash(this.name, this.hp);
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

	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.mp = this.mp;
		result.sword = this.sword.clone();
		return result;
	}

	void heroMudo() {
		this.hp = 0;
	}
}
