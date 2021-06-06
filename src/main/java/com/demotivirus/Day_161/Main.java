package com.demotivirus.Day_161;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Johan Shtrauss");

        Book book = new Book("Great book");
        book.addAuthor(author);

        Shelf shelf = new Shelf();
        shelf.addBook(book);
        shelf.setNumber(10);

        Human human = new Human("Only human");
        human.addBookForPersonaReading(book);

        System.out.println(author);
        System.out.println(book);
        System.out.println(shelf);
        System.out.println(human);
    }
}
