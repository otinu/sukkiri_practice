package sukkiri_practice;

import java.io.File;

public class Code7_11 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		JsonFileData file = mapper.readValue(new File("hero.json"), JsonFileData.class);
		System.out.println("名前：" + file.hero.name);
	}

}
