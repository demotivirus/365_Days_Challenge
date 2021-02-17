package com.demotivirus.Day_058;

import lombok.Data;
import lombok.NonNull;

@Data
public class Phone {
    @NonNull
    private String mark;
    private Notebook notebook;

    public Phone(){
        notebook = new Notebook();
    }

    public Phone(@NonNull String mark) {
        this.mark = mark;
        this.notebook = new Notebook();
    }

    public void addNote(String title, String note){
        notebook.addNote(title, note);
    }
}
