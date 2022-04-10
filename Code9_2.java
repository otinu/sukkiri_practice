package sukkiri_practice;

public class Code9_2 {

	PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");

	pstmt.setInt(1, 10);
	pstmt.setString(2, "ゾンビ");

	int r = pstmt.executeUpdate();

	if(r != 0) {
		System.out.println(r + "件のモンスターを削除しました");
	} else {
		System.out.println("該当するモンスターはありませんでした");
	}
	pstmt.close();
}
