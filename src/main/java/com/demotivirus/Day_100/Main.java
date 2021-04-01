package com.demotivirus.Day_100;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Genre genre = Flyweight.getGenre("fantastic");
            System.out.println(genre.hashCode());
            Genre genre2 = Flyweight.getGenre("fantasy");
            System.out.println(genre2.hashCode());
        }
    }
}
