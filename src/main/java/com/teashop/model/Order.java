package main.java.com.teashop.model;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Item> orders;

    public Order(int orderId, ArrayList<Item> orders) {
        this.orderId = orderId;
        this.orders = orders;
    }

    public ArrayList<Item> getOrders() {
        return orders;
    }

    public int getOrderId() {
        return orderId;
    }

    public void removeItemfromOrder(int itemId) {
        try{
        orders.removeIf(item -> itemId == item.getItemId());
        }catch (Exception e){
            System.out.println("ERRRRRRRRORR");
        }
    }

}
