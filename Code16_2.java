package sukkiri_practice;

import java.util.Scanner;

public class Code16_2 {

	public static void main(String[] args) {
		System.out.println("止めるには「STOP」を入力してください");
		System.out.println("カウントダウンを開始します");
		Thread t = new PrintingThread();
		t.start();
		String input = new Scanner(System.in).nextLine(); //並列処理で入力を受け付ける
		System.out.println("入力文字列:" + input);
		System.out.println("停止処理は未作成です");
	}

}
