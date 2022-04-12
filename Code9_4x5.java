package sukkiri_practice;

public class Code9_4x5 {

	// レコード数が2つ以上の場合
	while(rs.next()) {
		System.out.println(rs.getString("NAME"));
	}

	// 単一のレコードを取得しようとする場合
	if(rs.next()) {
		System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
	} else {
		System.out.println("ゴブリンはありませんでした");
	}
}
