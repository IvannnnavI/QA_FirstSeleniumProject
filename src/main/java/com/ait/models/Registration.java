package com.ait.models;

public class Registration {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;
    private  String confirmPassword;


    public Registration setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Registration setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Registration setEmail(String email) {
        this.email = email;
        return this;
    }

    public Registration setPassword(String password) {
        this.password = password;
        return this;
    }

    public Registration setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }


}
