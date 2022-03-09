package sukkiri_practice;

import java.util.TimeZone;

public class Code4_6 {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getDefault();
		System.out.println("現在のタイムゾーン");
		System.out.println(tz.getDisplayName());
		if(tz.useDaylightTime()) {
			System.out.println("夏の時間を採用しています");
		} else {
			System.out.println("夏の時間を採用していません");
		}
		System.out.println("世界標準との時差は");
		System.out.println(tz.getRawOffset() / 3600000 + "時間");
	}

}
