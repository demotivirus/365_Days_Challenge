package com.demotivirus.Day_147;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Notebook {
    private List<Page> pages = new ArrayList<>();
    private int maxPages;

    public Notebook(int numOfPages) {
        maxPages = numOfPages;
    }

    public void addText(String text) {
        pages.add(new Page(new Text(text)));
    }
}
