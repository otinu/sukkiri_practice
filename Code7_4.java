package sukkiri_practice;

import org.apache.commons.*;
import java.io.FileReader;

public class Code7_4 {

	public static void main(String[] args) {
		FileReader fr = new FileReader("test.txt");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
		for(CSVRecord r : records) {
			String name = r.get(0);
			String hp = r.get(1);
			String mp = r.get(2);
			System.out.println(name + "/" + hp + "/" + mp);
		}
	}

}
