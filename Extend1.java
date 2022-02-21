package sukkiri_practice;

public class Extend1 {

	public static void main(String[] args) {
		// subPocketはheroUnitとそのサブクラスのみインスタンス生成可能
		subPocket<heroUnit> sp = new subPocket<>();
		subPocket<Hero> sp2 = new subPocket<>();

		// heroUnitと継承関係にないクラスはインスタンス生成不可
		subPocket<String> sp3 = new subPocket<>();
	}

}
