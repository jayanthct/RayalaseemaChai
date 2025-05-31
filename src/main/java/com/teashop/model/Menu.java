package main.java.com.teashop.model;

import main.java.com.teashop.database.DatabaseManager;
import main.java.com.teashop.database.QueryResult;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Menu {

    public static ArrayList<Item> getMenuItems() {
        ArrayList<Item> menu = new ArrayList<>();
        String query = "SELECT * FROM items";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DatabaseManager.getConnection();
            QueryResult result = DatabaseManager.executeQuery(query, conn);

            if (result != null) {
                stmt = result.stmt;
                rs = result.rs;

                while (rs.next()) {
                    int id = rs.getInt("item_id");
                    String name = rs.getString("item_name");
                    int price = rs.getInt("item_price");
                    int quantity = rs.getInt("item_quantity");
                    menu.add(new Item(id, name, price,quantity));
                }
            }
        } catch (SQLException e) {
            System.out.println("DB fetch error: " + e.getMessage());
        } finally {
            DatabaseManager.closeResources(conn, stmt, rs);
        }

        return menu;
    }

}
