package com.demotivirus.Day_173;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.demotivirus.Day_173.EmailConstants.*;

public class MapChipsAndTricks {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.putIfAbsent("Mike", MIKE.getEmail()); //add if key is not present
        users.putIfAbsent("Mike", "sdfewer@gmail.com"); //not add because key is present
        users.putIfAbsent("Jhon", JHON.getEmail());
        users.putIfAbsent("Anna", ANNA.getEmail());

        printMapLambdaForEach(users);

        System.out.println("User Mike is exists? " + users.containsKey("Mike")); //find key
        System.out.println("Email " + ANNA.getEmail() + " is exists? " + users.containsValue(ANNA.getEmail()) + "\n"); //find val

        users.remove("Anna", "annaLee@gmail.COM"); //remove if key + value is exists
        printMap(users);

        Set<String> keys = users.keySet(); //contains all keys in map
        System.out.println(keys + "\n");

        Collection<String> values = users.values(); //contains all values in map
        System.out.println(values + "\n");

        Set<Map.Entry<String, String>> entry = users.entrySet(); //return key-values
        System.out.println(entry + "\n");

        System.out.println(users); // not need forEach now
    }

    private static void printMapLambdaForEach(Map<String, String> map) {
        map.forEach((k, v) -> System.out.println("key [" + k + "] val [" + v + "]"));
        System.out.println();
    }
    
    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key [" + entry.getKey() + "] val [" + entry.getValue() + "]");
        }
        System.out.println();
    }
}
