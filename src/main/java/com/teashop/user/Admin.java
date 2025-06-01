package main.java.com.teashop.user;

import main.java.com.teashop.abstractclasses.User;
import main.java.com.teashop.database.DatabaseManager;

public class Admin extends User {

    public Admin(String name, String phonenumber){
        super(name,phonenumber,"admin");

    }

    @Override
    public void showDashboard() {
        System.out.println("Admin Dashboard");
    }

    //use password to autherize the user as admin
    public boolean authenticate(String password) {
        return password.equals("admin123");
    }

    //works
    public void addItem(){

    }

    public void removeItem(){

    }

    public void updateItem(){

    }
}
