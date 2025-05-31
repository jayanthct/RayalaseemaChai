package main.java.com.teashop.model;

import java.util.ArrayList;

public class Order {
    int orderId;
    ArrayList<Item> orders;

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
            //myapproch
//            for(Item item : orders){
//                if(itemId==item.itemId){
//                    orders.remove(item);
//                }
//            }

        orders.removeIf(item -> itemId == item.itemId);
        }catch (Exception e){
            System.out.println("ERRRRRRRRORR");
        }
    }




}
