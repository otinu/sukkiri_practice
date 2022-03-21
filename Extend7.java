package sukkiri_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;

public class Extend7 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException  {
		FileOutputStream fos = new FileOutputStream("test.txt");

		// 任意のアルゴリズムのインスタンスを取得
		Cipher algo = Cipher.getInstance("DES");
		CipherOutputStream cos = new CipherOutputStream(fos, algo);
		cos.write(65);
	}

}
