package sukkiri_practice;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Code5_3 {
	String name;
	String address;

	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	public static void main(String[] args) {

		Code5_3 ob1 = new Code5_3();
		ob1.name = "tinu";
		ob1.address = "sea";

		Code5_3 ob2 = new Code5_3();
		ob2.name = "kiss";
		ob2.address = "sea";

		System.out.println(ob1.equals(ob2));
	}

}
