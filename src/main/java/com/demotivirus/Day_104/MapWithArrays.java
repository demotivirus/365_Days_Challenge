package com.demotivirus.Day_104;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithArrays {
    public static void main(String[] args) {
        Map<String, String[]> passwords = new HashMap<>();

        String[] erickPass = {"s9xff993", "840823nksdf", "93bsnsnsnsUsdfn"};
        passwords.put("Erick", erickPass);

        System.out.println(Arrays.asList(passwords.get("Erick")));
    }
}
