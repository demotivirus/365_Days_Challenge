package com.demotivirus.Day_115;

import lombok.AllArgsConstructor;

import java.io.StringReader;
import java.util.List;
import java.util.function.Predicate;

@AllArgsConstructor
public class Where implements Expression {
    private Predicate<String> filter;

    @Override
    public List<String> interpret(Context context) {
        context.setFilter(filter);
        return context.search();
    }
}
