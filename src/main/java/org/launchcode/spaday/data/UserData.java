package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;

public class UserData {

    //provides access to a list of users via add, getAll, and getById

    private ArrayList<User> users = new ArrayList<>();

    public void add(User user){
        users.add(user);
    }

    public ArrayList<User> getAll(){
        return users;
    }

    public User getById(int id){
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getId() == id) return users.get(i);
        }
        return null; 
    }
}
