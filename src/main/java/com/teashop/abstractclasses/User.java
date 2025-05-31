package main.java.com.teashop.abstractclasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class User {

    // fields
    protected String name;
    protected String phoneNumber;
    protected String userType;
    protected String createdAt;

    public User(){
        this.name = null;
        this.phoneNumber = null;

        this.userType = null;
        this.createdAt = null;
    }



    // for customer constructor
    public User(String name, String phonenumber, String userType) {
        this.name = name;
        this.phoneNumber = phonenumber;
        this.userType = userType;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.createdAt = now.format(formatter);
    }


    public String getName() {
        return name;
    }
    public String getPhonenumber() {
        return phoneNumber;
    }
    public String getUserType() {
        return userType;
    }
    public String getCreatedAt() {
        return createdAt;
    }

    public abstract void showDashboard();


}
