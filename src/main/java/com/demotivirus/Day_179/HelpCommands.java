package com.demotivirus.Day_179;

public class HelpCommands {
    public static void print() {
        System.out.println("""
                CREATE TABLE    create new class with standard SQL syntax
                -P --path       specify file path to generating classes
                --package       specify package name in generated classes
                --demo          demonstrate working requests & show syntax
                """);
    }
}
