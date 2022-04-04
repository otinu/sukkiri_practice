package sukkiri_practice;

import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

public class Code7_20 {

	public static void main(String[] args) {
		BufferedImage image = ImageIO.read(new File("sample.jpg"));
		try(FileOutputStream fos = new FileOutputStream("sample.png")) {
			ImageIO.write(image, "png", fos);
		}
	}

}
