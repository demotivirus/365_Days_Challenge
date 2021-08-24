package com.demotivirus.Day_236;

import java.util.ArrayList;
import java.util.List;

import static com.demotivirus.Day_236.Type.*;
import static com.demotivirus.Day_236.Type.GOLD;

public class ReplaceElementsInCollections {
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>() {{
            add(new Melon(HONEY, 3600));
            add(new Melon(GOLD, 3400));
            add(new Melon(YELLOW, 2300));
            add(new Melon(HONEY, 2300));
            add(new Melon(YELLOW, 2300));
            add(new Melon(GOLD, 2200));
        }};

        for (int i = 0; i < melons.size(); i++) {
            if (melons.get(i).getWeight() < 3000)
                melons.set(i, new Melon(HONEY, 3000));
        }

        System.out.println(melons);
    }
}
