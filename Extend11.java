package sukkiri_practice;

public class Extend11 {

	public static void main(String[] args) {
		
		// 日時情報を指定する場合
		java.util.Date d = new java.util.Date();
		long l = d.getTime();
		Timestamp ts = new Timestamp(1);
		pstmt.setTimestamp(1, ts);
		
		// DBから取り出したレコードを扱う場合
		java.sql.Timestamp ts = rs.getTimestamp(1);
		long l = ts.getTime();
		java.util.Date d = new Date(1);
	}

}
