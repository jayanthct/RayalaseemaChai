package main.java.com.teashop.model;

import java.util.ArrayList;

public class Item {
    int itemId;
    String itemName;
    int itemPrice;

    public Item(int itemId, String itemName, int itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public ArrayList<Item> Menu(){
        ArrayList<Item> items = new ArrayList<>();
        return items; ////not completed actually we have to read from database and then store into arraylist then return
    }

}
