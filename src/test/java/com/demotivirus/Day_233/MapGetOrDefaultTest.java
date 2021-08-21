package com.demotivirus.Day_233;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapGetOrDefaultTest {
    @Test
    private void testDefaultOnMap() {
        Map<String, String> map = new HashMap<>();
        map.put("postgres", "localhost:5432");
        map.put("mysql", "localhost:3306");
        map.put("cassandra", "localhost:9042");

        map.get("derby"); //null
        map.getOrDefault("derby", "localhost:27017");
    }
}
