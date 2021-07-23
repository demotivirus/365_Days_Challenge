package com.demotivirus.Day_206;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples8 {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<Integer> collect = numbers1.stream()
                .flatMap((i ->
                        numbers2.stream()
                                .filter(j -> (i + j) % 3 == 0)
                                .map(j -> new Integer[]{i, j})))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(Arrays.asList(collect));

        System.out.println("=============");

        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i -> numbers2.stream()
                                .map(j -> new int[]{i, j})
                        )
                        .collect(Collectors.toList());
        //System.out.println(Arrays.stream(new List[]{pairs}));
    }
}
