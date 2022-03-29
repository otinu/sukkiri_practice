package sukkiri_practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Code7_8 {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		ResourceBundle rb = ResourceBundle.getBundle("messages");
		System.out.println(rb.getString("CURRENT_TIME_IS") + now);
	}

}
