package com.demotivirus.Day_115;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<String> result;

        Expression query1 = new Select("name", new From("people"));
        result = query1.interpret(context);
        System.out.println(result);

        Expression query2 = new Select("*", new From("people"));
        result = query2.interpret(context);
        System.out.println(result);

        Expression query3 = new Select("name", new From("people", new Where(name -> name.toLowerCase().startsWith("a"))));
        result = query3.interpret(context);
        System.out.println(result);
    }
}
