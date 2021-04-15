package com.demotivirus.Day_114;

public class Main {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedWomenExpression();

        System.out.println(isMale.interpret("Doe"));
        System.out.println(isMarried.interpret("Married Nana"));
    }

    private static Expression getMaleExpression(){
        Expression name = new TerminalExpression("Jhon");
        Expression familyName = new TerminalExpression("Doe");
        return new OrExpression(name, familyName);
    }

    private static Expression getMarriedWomenExpression(){
        Expression name = new TerminalExpression("Nana");
        Expression isMarried = new TerminalExpression("Married");
        return new AndExpression(name, isMarried);
    }
}
