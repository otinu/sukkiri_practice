package sukkiri_practice;

public class Extend5 {

	public static void main(String[] args) {

		// OSによっては「\r」や「\n」が復帰や改行を意味しない場合がある
		System.out.println("Hello\nWorld");
		System.out.println("Hello\rWorld");
		System.out.println("Hello\r\nWorld");
		System.out.println("Hello\n\rWorld");

		// line.separatorを利用することで、どのOSでも対応できるようになる
		final String BR = System.getProperty("line.separator");
		System.out.println("Hello" + BR + "World");
	}

}
