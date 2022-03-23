package sukkiri_practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Extend9 {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("test.txt");
		Files.delete(p1);
	}

}
