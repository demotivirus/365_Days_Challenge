package com.demotivirus.Day_115;

import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Setter
public class Context {
    private static Map<String, List<FIO>> tables = new HashMap<>();
    private String table;
    private String column;

    /**
     * Index of column to be shown in result.
     * Calculated in {@link #setColumnMapper()}
     */
    private int colIndex = -1;

    static {
        List<FIO> fioList = new ArrayList<>();
        fioList.add(new FIO("Jhon", "Doe"));
        fioList.add(new FIO("Anna", "Lee"));
        fioList.add(new FIO("Paul", "Kalkbrenner"));

        tables.put("people", fioList);
    }

    /**
     * Default setup, used for clearing the context for next queries.
     * See {@link Context#clear()}
     */
    private static final Predicate<String> matchAnyString = s -> s.length() > 0;
    private static final Function<String, Stream<String>> matchAllColumns = Stream::of;

    /**
     * Varies based on setup in subclasses of {@link Expression}
     */
    private static Predicate<String> whereFilter = matchAnyString;
    private static Function<String, Stream<String>> columnMapper = matchAllColumns;

    public void setFilter(Predicate<String> filter) {
        whereFilter = filter;
    }

    public void clear() {
        column = "";
        columnMapper = matchAllColumns;
        whereFilter = matchAnyString;
    }

    List<String> search() {
        List<String> result = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map(FIO::toString)
                .flatMap(columnMapper)
                .filter(whereFilter)
                .collect(Collectors.toList());

        clear();

        return result;
    }

    private void setColumnMapper() {
        switch (column) {
            case "*" -> colIndex = -1;
            case "name" -> colIndex = 0;
            case "surname" -> colIndex = 1;
        }

        if (colIndex == -1)
            columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
    }
}
