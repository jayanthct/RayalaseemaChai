package main.java.com.teashop.model;

import main.java.com.teashop.database.DatabaseManager;
import main.java.com.teashop.database.QueryResult;
import main.java.com.teashop.utils.ANSIColors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Menu {

    public static void printMenu(ArrayList<Item> menu,String name,String phno){

        System.out.println(ANSIColors.BRIGHT_YELLOW+ "                🌶 RAYALASEEMA CHAI 🔥 – One Sip, Full Trip ☕                     " + ANSIColors.RESET);
        System.out.println(ANSIColors.BRIGHT_YELLOW + "                     ☕ రాయలసీమ టీ | ఊపు‌తో ఊరే లెవల్! 🔥                     " + ANSIColors.RESET);
        System.out.println();
        System.out.println(ANSIColors.BRIGHT_MAGENTA + "                     Welcome"+ name + ANSIColors.RESET);
        System.out.println();
        System.out.printf(ANSIColors.BRIGHT_YELLOW + "%-10s %-20s %-10s\n", "Item ID", "Item Name", "Price (₹)");
        System.out.println(ANSIColors.BRIGHT_YELLOW + "---------------------------------------------" + ANSIColors.RESET);

        for (Item item : menu) {
            System.out.printf(ANSIColors.GREEN + "%-10d %-20s %-10d\n" + ANSIColors.RESET,
                    item.getItemId(), item.getItemName(), item.getItemPrice());
        }
    }

    public static ArrayList<Item> getMenuItems() {
        ArrayList<Item> menu = new ArrayList<>();
        String query = "SELECT * FROM item";

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
                    menu.add(new Item(id, name, price));
                }
            }
        } catch (SQLException e) {
            System.out.println("DB fetch error: " + e.getMessage());
        } finally {
            DatabaseManager.closeResources(conn, stmt, rs);
        }

        return menu;
    }

    public static void main(String[] args) {
        ArrayList<Item> menu = getMenuItems();
        printMenu(menu,"ravi","988898878");
    }
}
