package com.demotivirus.Day_100;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private static Map<String, Genre> genres = new HashMap<>();

    public static Genre getGenre(String genre){
        Genre gen = genres.get(genre);
        if (gen == null){
            switch (genre){
                case "fantastic" : gen = new Fantastic(); break;
                case "fantasy" : gen = new Fantasy(); break;
            }
        }
        genres.put(genre, gen);
        return gen;
    }
}
