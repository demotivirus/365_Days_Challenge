package com.demotivirus.Day_214_215.Tip_12;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
