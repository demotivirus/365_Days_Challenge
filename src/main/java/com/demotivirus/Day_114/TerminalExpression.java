package com.demotivirus.Day_114;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TerminalExpression implements Expression {
    private String data;

    @Override
    public boolean interpret(String context) {
        if (context.contains(data))
            return true;
        return false;
    }
}
