package main.java.com.teashop.model;

import java.util.ArrayList;

public class Item {
    private int itemId;
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public Item(int itemId, String itemName, int itemPrice, int itemQuantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public int getItemId() {
        return itemId;
    }

    public ArrayList<Item> Menu(){
        ArrayList<Item> items = new ArrayList<>();
        return items; ////not completed actually we have to read from database and then store into arraylist then return
    }

}
