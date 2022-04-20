package sukkiri_practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Code16_1 {

	public static void main(String[] args) {
		System.out.println("止めるには「STOP」を入力してください");
		System.out.println("カウントダウンを開始します");
		for(int i = 9; i >= 0; i--) {
			System.out.println(i + "..");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch(InterruptedException e) {
				;
			}
		}
		String input = new Scanner(System.in).nextLine();
		System.out.println("入力文字列:" + input);
	}
}
