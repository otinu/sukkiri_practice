package sukkiri_practice;

public class Code7_3 {

	public static void main(String[] args) {

		// CSV形式にする手段の一つとして、split()を活用する
		String s = "黒鯛, メジナ, 鱚";
		String[] st = s.split(",");
		for(String t: st) {
			System.out.println(t);
		}
	}

}
