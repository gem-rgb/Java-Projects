package com.king.myacceleratorfirebasedatabaseapp;

/**
 * User
 *
 * Part of Android-Firebase-Database-App-with-Java.
 * Provides core application logic, lifecycle management, and UI component coordination.
 */
public class User {
    private String name, email, phone,time;

    public User(String name, String email, String phone, String time) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.time = time;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
