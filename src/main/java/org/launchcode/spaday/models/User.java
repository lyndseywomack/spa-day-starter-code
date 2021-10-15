package org.launchcode.spaday.models;

public class User {

    //Your User class should have a few private fields with getters and setters: username, email, password.
    //class variables
    private String username;
    private String email;
    private String password;

    //constructors

//    public User(String username, String email, String password) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//    }

    //getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //other methods
}
