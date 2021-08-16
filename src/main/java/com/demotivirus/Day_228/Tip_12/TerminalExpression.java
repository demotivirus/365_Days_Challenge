package com.demotivirus.Day_228.Tip_12;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TerminalExpression implements Expression {
    private String data;

    @Override
    public boolean interpret(String context) {
        return context.contains(data) ? true : false;
    }
}
