package com.demotivirus.Day_202;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Board {
    @NonNull
    private String boardName;
    private List<SectionName> sections = new ArrayList<>();

    public void addSection(SectionName sectionName) {
        sections.add(sectionName);
    }

    public void deleteSection(SectionName sectionName) {
        sections.remove(sectionName);
    }

    public void addSticker(SectionName sectionName, Sticker sticker) {
        if (sections.contains(sectionName)) {
            int i = sections.indexOf(sectionName);
            SectionName sectionName1 = sections.get(i);
            sectionName1.addSticker(sticker);
            sections.add(sectionName1);
        }
    }
}
