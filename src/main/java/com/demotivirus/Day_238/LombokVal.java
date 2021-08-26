package com.demotivirus.Day_238;

import lombok.val;

import java.util.HashMap;
import java.util.Map;

public class LombokVal {
    public static void main(String[] args) {
        val map = new HashMap<String, String>() {{
            put("immutable", "map");
        }};

        val map2 = Map.of(
                "immutable", "map"
        );
    }
}
