package com.demotivirus.Day_074;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Lenin public library");
        library.putBookOnTheShelf(new Book("Thom Sower", "Mark Twain"));
        System.out.println(library.getShelf().getBooks());
    }
}
