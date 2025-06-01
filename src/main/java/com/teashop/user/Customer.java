package main.java.com.teashop.user;

import main.java.com.teashop.abstractclasses.User;
import main.java.com.teashop.model.Item;
import main.java.com.teashop.model.Menu;
import main.java.com.teashop.model.Order;
import main.java.com.teashop.userInterfaceUI.CustomerUI;

import java.util.ArrayList;


public class Customer extends User {

    public Customer(String name, String phonenumber){
        super(name,phonenumber,"customer");
    }

    // must implement the USER abstract class abstract methods
    @Override
    public void showDashboard() {
        // Starting the Dashboard of Customer
        CustomerUI.start();
    }

    //works
    public void orderItems(){
        System.out.println("Menu Order Items");
    }

    public void cancelOrder(){
        System.out.println("Menu Cancel Order");
    }
}
