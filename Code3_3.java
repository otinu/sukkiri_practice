package sukkiri_practice;

import java.util.Set;

@FunctionalInterface
public interface Code3_3 {

	// オリジナルの関数インタフェースを自分で定義することも可能
	public abstract void process(Set<Hero> party, Hero leader, String pName);
}
