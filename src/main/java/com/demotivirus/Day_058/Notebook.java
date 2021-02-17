package com.demotivirus.Day_058;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Notebook {
    private List<Note> notes = new ArrayList<>();

    public void addNote(String title, String note) {
        notes.add(new Note(title, note));
    }
}
