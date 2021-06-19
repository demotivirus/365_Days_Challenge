package com.demotivirus.Day_173;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//HOW TO STORE MULTIPLY VALUES IN MAP???
//USE LIST IN VALUE!!!
public class MapMultimap {
    public static void main(String[] args) {
        Map<String, List<String>> multiMap = new HashMap<>();
        List<String> multiValues = new ArrayList<>();
        multiValues.add("Val1");
        multiValues.add("Val2");
        multiValues.add("Val3");
        multiValues.add("Val4");

        multiMap.putIfAbsent("Key1", multiValues);
        System.out.println(multiMap);
    }
}
