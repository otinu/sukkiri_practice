package sukkiri_practice;

import java.sql.*;

try {
	Class.forName("org.h2.Driver");
} catch(ClassNotFoundException e) {
	throw new IllegalStateException("ドライバーのロードに失敗しました");
}

Connection con = null;
	try {
		con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
		if(con != null) {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

public class Code9_1 {
}


