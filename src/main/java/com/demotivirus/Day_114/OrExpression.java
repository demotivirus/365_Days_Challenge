package com.demotivirus.Day_114;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrExpression implements Expression {
    private Expression one;
    private Expression two;

    @Override
    public boolean interpret(String context) {
        return one.interpret(context) || two.interpret(context);
    }
}
