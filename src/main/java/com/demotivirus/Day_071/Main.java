package com.demotivirus.Day_071;

public class Main {
    public static void main(String[] args) {
        String str = String.valueOf(new AggressiveConstructor("sdfsdf"));
        System.out.println(str);

        App app = new App("Hello", "World");
        app.run();

        NotElegant notElegant = new NotElegant("Mikle", "Mikel", "Novak");
        System.out.println(notElegant);
    }
}
