package com.demotivirus.Day_182;

public class DemoCommandsAndSyntax {
    public static void print() {
        System.out.println("""
                SQL syntax              create table User (firstName char, role int REFERENCES Role (id));
                SQL mixed               create table User (firstName char, Role role); //not working et
                Java syntax             public class User (String firstName, Role role); //not working et
                
                SQL syntax + methods    create table User (password char, getPass() varchar, setPass() void);
                """);
    }
}
