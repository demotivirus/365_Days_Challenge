package com.demotivirus.Day_179;

public class DemoCommandsAndSyntax {
    public static void print() {
        System.out.println("""
                SQL syntax      create table User (firstName char, role int REFERENCES Role (id)); //recommended but not working like this
                SQL mixed       create table User (firstName char, Role role); //not working et
                Java syntax     public class User (String firstName, Role role); //not working et
                """);
    }
}
