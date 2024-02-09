package com.phillip_dev.fiels_validation01;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "First name too short")
    private String firstName;
    private String lastName;
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 7, message = "Username too short, must have 7+ characters")
    private String userName;
    @NotBlank(message = "email cannot be blank")
    @Email(message = "email is not valid")
    private String email;
    @Past(message = "D.O.B must be in the past")
    @DateTimeFormat(pattern =  "yyyy-mm-dd")
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
