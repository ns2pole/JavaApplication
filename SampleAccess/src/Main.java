// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        String url = "jdbc:postgressql://localhost:5432/postgres";
        String user = "postgres";
        String password = "";

        try{
            conn = DriverManager.getConnection(url, user, password);

            conn.setAutoCommit(false);

            stmt = conn.createStatement();
            String sql = "SELECT * FROM 蔵書テーブル";
            rset = stmt.executeQuery(sql);
        }
    }
}