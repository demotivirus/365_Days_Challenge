package com.demotivirus.Day_161;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Shelf {
    @Setter @Getter
    private int number;
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
}
