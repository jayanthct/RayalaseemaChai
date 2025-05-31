package main.java.com.teashop.user;

import main.java.com.teashop.abstractclasses.User;

public class Admin extends User {

    public Admin(String name, String phonenumber){
        super(name,phonenumber,"admin");
    }

    @Override
    public void showDashboard() {
        System.out.println("Admin Dashboard");
    }

}
