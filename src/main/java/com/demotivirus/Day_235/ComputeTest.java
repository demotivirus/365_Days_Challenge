package com.demotivirus.Day_235;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("postgres", "localhost:5432");
        map.put("mysql", "localhost:3306");
        map.put("cassandra", "localhost:9042");

        BiFunction<String, String, String> jdbcUrl = (k, v) -> "jdbc:" + k + "://" + v + "/customer_db";
        String mySqlUrl = map.computeIfPresent("mysql", jdbcUrl); //if not null
        System.out.println(mySqlUrl);

        String voltDb = map.computeIfPresent("voltDb", jdbcUrl); //is null
        System.out.println(voltDb);
    }
}
