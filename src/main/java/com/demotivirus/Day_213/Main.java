package com.demotivirus.Day_213;

public class Main {
    public static void main(String[] args) {
        TextParser textParser = new TextParser();
        String textFromDocument = textParser.parse("you\\path\\here");

        SplitTextWithDot splitText = new SplitTextWithDot();
        String split = splitText.split(textFromDocument);
        //System.out.println(split);

        FindWordInText findWord = new FindWordInText();
        String word = findWord.find(splitText.getStrings(), "almost");
        System.out.println(word);
    }
}
