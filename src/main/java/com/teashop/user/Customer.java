package main.java.com.teashop.user;

import main.java.com.teashop.abstractclasses.User;


public class Customer extends User {

    public Customer(String name, String phonenumber){
        super(name,phonenumber,"customer");
    }

    @Override
    public void showDashboard() {
        System.out.println("Dashboard of customer");
    }
}
