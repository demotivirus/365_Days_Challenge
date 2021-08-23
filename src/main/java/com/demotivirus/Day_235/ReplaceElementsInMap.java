package com.demotivirus.Day_235;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import static com.demotivirus.Day_235.Type.*;

public class ReplaceElementsInMap {
    public static void main(String[] args) {
        Map<Integer, Melon> map = new HashMap<>();
        map.put(1, new Melon(HONEY, 255));
        map.put(2, new Melon(YELLOW, 301));
        map.put(3, new Melon(GOLD, 217));

        map.replace(2, new Melon(GOLD, 315));
        System.out.println(map);

        BiFunction<Integer, Melon, Melon> function =
                (k, v) -> v.getWeight() < 300 ? new Melon(v.getType(), 1000) : v;
        map.replaceAll(function);

        System.out.println(map);
    }
}
