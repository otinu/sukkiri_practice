package sukkiri_practice;

import java.io.IOException;

public class Code4_2 {

	public static void main(String[] args) throws IOException {

		// Javaプログラムからメモ帳を開く
		ProcessBuilder pb = new ProcessBuilder("メモ帳の実行ファイルパス", "開きたいtxtファイルのパス");

		pb.start();
	}

}
