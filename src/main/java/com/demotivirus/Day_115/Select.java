package com.demotivirus.Day_115;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Select implements Expression {
    private String column;
    private From from;

    @Override
    public List<String> interpret(Context context) {
        context.setColumn(column);
        return from.interpret(context);
    }
}
