package com.demotivirus.Day_228.Tip_12;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
