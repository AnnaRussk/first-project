package practice8.exceptions.checked;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "user", "123");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println("User: " + rs.getString("username"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("SQL error " + e.getMessage());
            }
        }
    }
}
