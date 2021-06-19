package com.demotivirus.Day_173;

import java.util.ArrayList;
import java.util.List;

public class ListChipsAndTricks {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("my");
        list.add("friend");

        var index = list.indexOf("friend");
        System.out.println("index of \"friend\" word is: " + index); //search element in list
        System.out.println("get element from index: " + list.get(index));

        list.forEach(System.out::println); // iterate for list with Stream api
        list.forEach(str -> System.out.println(str)); //analog iterate
    }
}
