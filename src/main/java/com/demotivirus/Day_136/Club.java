package com.demotivirus.Day_136;

import java.util.HashMap;
import java.util.Map;

public class Club {
    private Shop shop = new Shop();
    private Map<People, Boolean> peoplesIsAccess = new HashMap<>();

    public void checkAge(People people) {
        if (people.getAge() < 18) {
            System.out.println("The club is closed for you " + people.getName());
            peoplesIsAccess.put(people, false);
        }
        else {
            System.out.println("Welcome " + people.getName() + "!");
            peoplesIsAccess.put(people, true);
        }
    }
    
    public void buyWhiskey(People people) {
        if (peoplesIsAccess.get(people) != null) {
            shop.buyWhiskey(people, peoplesIsAccess.get(people));
        } else System.out.println("Not now " + people.getName());
    }
}
