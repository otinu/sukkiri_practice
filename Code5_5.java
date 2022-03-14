package sukkiri_practice;

import java.util.logging.LogManager;

public class Code5_5 {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Main.class);
		if(args.length != 2) {
			logger.error("起動引数の数が異常: " + args.length);
		}
	}

}
