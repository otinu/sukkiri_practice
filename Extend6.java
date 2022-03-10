package sukkiri_practice;

public class Extend6 {

	public static void main(String[] args) {

		// 残りのメモリ容量
		long f = Runtime.getRuntime().freeMemory();
		System.out.println(f);

		// 現在のメモリ総容量
		long t = Runtime.getRuntime().totalMemory();
		System.out.println(t);

		// メモリ総容量の限界値
		long m = Runtime.getRuntime().maxMemory();
		System.out.println(m);
	}

}
