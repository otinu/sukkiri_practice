package sukkiri_practice;

public class Code4_7 {

	public static void main(String[] args) {

		// java.lang.Class型は型そのものを扱う
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getPackage().getName());

		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName());
	}

}
