package org.example;

import java.util.ArrayList;

public class UserManager {
    public ArrayList <User> users = new ArrayList<User>();
    public String getNameOldestUser () {
        return users.stream().findFirst().toString();
    }
    
}
