package com.demotivirus.Day_235;

import java.util.*;

import static com.demotivirus.Day_235.Type.*;

public class SortMapTest {
    public static void main(String[] args) {
        Map<String, Melon> map = new HashMap<>();
        map.put("1", new Melon(HONEY, 255));
        map.put("2", new Melon(YELLOW, 301));
        map.put("3", new Melon(GOLD, 217));

        List<String> sortedKeys = sortByKeyList(map);
        System.out.println(sortedKeys);
    }

    public static <K extends  Comparable, V> List<K> sortByKeyList(Map<K, V> map) {
        List<K> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        return list;
    }
}
