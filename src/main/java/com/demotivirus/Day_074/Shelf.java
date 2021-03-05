package com.demotivirus.Day_074;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Shelf {
    private List<Book> books;

    public Shelf() {
        this.books = new ArrayList<>();
    }

    public Shelf(Book book){
        this.books = new ArrayList<>();
    }


    public void add(Book book) {
        books.add(book);
    }
}
