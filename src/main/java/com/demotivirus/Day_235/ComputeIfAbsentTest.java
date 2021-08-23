package com.demotivirus.Day_235;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ComputeIfAbsentTest {
    public static void main(String[] args) throws UnknownHostException {
        Map<String, String> map = new HashMap<>();
        map.put("postgres", "jdbc:postgresql://127.0.0.l/customers_db");
        map.put("mysql", "jdbc:mysql://192.168.0.50/customers_db");

        String address = InetAddress.getLocalHost().getHostAddress();
        Function<String, String> jdbcUrl = k -> "://" + address + "/customer_url";

        String mongoDbUrl = map.computeIfAbsent("mongoDb", jdbcUrl); //if null - add value in map
        System.out.println(mongoDbUrl);
    }
}
