package com.demotivirus.Day_182_187.commands;

public class DemoBugCommands {
    public static void print() {
        System.out.println("""
                create table Message (id bigint, chatId bigint, user User, timestamp Timestamp, data String) methods (int compareBodyTimestamp(Message first, Message second));
                create table User (id integer, name char, city varchar, age integer, sex Sex);
                """);
    }
}
