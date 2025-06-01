package main.java.com.teashop.database;

import main.java.com.teashop.database.QueryResult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    //database connection URL
    private static final String DB_URL = "jdbc:sqlite:rayalaseemachai.sqlite"; //dummy one for reference

    // Get Connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    // Execute SELECT query
    public static QueryResult executeQuery(String query, Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return new QueryResult(stmt, rs);
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
            return null;
        }
    }


    // Execute INSERT, UPDATE, DELETE
    public static int executeUpdate(String query, Connection conn) {
        try (
             Statement stmt = conn.createStatement()) {
            return stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error executing update: " + e.getMessage());
            return 0;
        }
    }

    // Close all resources safely
    public static void closeResources(Connection conn, Statement stmt, ResultSet rs) {
        try { if (rs != null) rs.close(); } catch (SQLException ignored) {}
        try { if (stmt != null) stmt.close(); } catch (SQLException ignored) {}
        try { if (conn != null) conn.close(); } catch (SQLException ignored) {}
    }

}
