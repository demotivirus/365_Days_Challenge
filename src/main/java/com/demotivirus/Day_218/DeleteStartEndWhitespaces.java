package com.demotivirus.Day_218;

public class DeleteStartEndWhitespaces {
    public static void main(String[] args) {
        String text = "\n \n\n hello \t \n \r";
        System.out.println(text.trim());

        char space = '\u2002';
        String text2 = space + "\n \n\n hello \t \n \r" + space;
        System.out.println(text2.trim()); //not delete
        System.out.println(text2.strip()); //delete UTF whitespaces
    }
}
