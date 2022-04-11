package sukkiri_practice;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Code9_3 {

	public static void main(String[] args) {
		PreparedStatement pstmt = xon.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");

		pstmt.setInt(1, 10);
		ResultSet rs = pstmt.executeQuery();

		rs.close();
		pstmt.close();
	}

}
