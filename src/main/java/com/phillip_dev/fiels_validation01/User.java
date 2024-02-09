package com.phillip_dev.fiels_validation01;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private Date detaOfBirth;


    public User(String firstName, String lastName, String userName, String email, Date detaOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.detaOfBirth = detaOfBirth;
    }

    public User() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDetaOfBirth() {
        return this.detaOfBirth;
    }

    public void setDetaOfBirth(Date detaOfBirth) {
        this.detaOfBirth = detaOfBirth;
    }

}
