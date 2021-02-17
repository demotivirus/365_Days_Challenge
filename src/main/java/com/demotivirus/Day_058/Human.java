package com.demotivirus.Day_058;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Human {
    @NonNull
    private String name;
    private List<Phone> phones;

    public void addPhone(Phone phone) {
        if (phones == null)
            phones = new ArrayList<>();
        phones.add(phone);
    }

    public void write(Phone phone, String title, String note) {
        for (Phone p : phones){
            if (p.equals(phone))
                p.addNote(title, note);
        }
    }
}
