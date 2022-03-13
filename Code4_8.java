package sukkiri_practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Code4_8 {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = RefSample.class;

		// 引数1つのコンストラクタを取得し、インスタンスを生成する
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample)cons.newInstance(256);	// 元々はRefSampleのため、キャスト可能

		// 指定したフィールドをインスタンスとして生成して操作する
		Field f = clazz.getField("times");
		f.set(rs, 2);
		System.out.println(f.get(rs));

		Method m = clazz.getMethod("hello", String.class, int.class);
		m.invoke(rs, "参照!", 128);

		boolean publ = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
		System.out.println("clazzはPublic修飾されている？ : " + publ + "\n");
		System.out.println("mはfinal修飾されている？ : " + finm);
		System.out.println("⇒mは引数2つのhello()を呼び出している");
		System.out.println("　⇒引数2つのhello()がfinal修飾されているか判定している");
	}

}
