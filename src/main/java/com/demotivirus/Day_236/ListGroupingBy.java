package com.demotivirus.Day_236;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.demotivirus.Day_236.Type.*;

public class ListGroupingBy {
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>() {{
            add(new Melon(HONEY, 3600));
            add(new Melon(GOLD, 3400));
            add(new Melon(YELLOW, 2300));
            add(new Melon(YELLOW, 2200));
        }};

        Map<Boolean, List<Melon>> separated = melons.stream()
                .collect(Collectors.groupingBy(
                        (Melon m) -> m.getWeight() < 3000
                ));

        List<Melon> lessThan3000 = separated.get(true);
        System.out.println(lessThan3000);
        List<Melon> greatThan3000 = separated.get(false);
        System.out.println(greatThan3000);
    }
}
