package com.demotivirus.Day_069;

public class Main {
    public static void main(String[] args) {
        Rus rus = new Rus();
        rus.addEngWord(new Eng("Translation"));
        rus.getAllEngWords();
        AbstractLanguage eng = new Eng();
        eng.addRusWord(new Rus());
    }
}
