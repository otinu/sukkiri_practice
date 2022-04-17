import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {

    try {
      Class.forName("org.h2.Driver");
    } catch (ClassNotFoundException e) {
      throw new IllegalStateException("ドライバのロードに失敗しました");
    }
    Connection con = null;
    try {
      con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
      con.setAutoCommit(false);
      con.commit();
    } catch (SQLException e) {
      try {
        con.rollback();
      } catch (SQLException e2) {
        e2.printStackTrace();
      }
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e3) {
          e3.printStackTrace();
        }
      }
    }

  }
}
