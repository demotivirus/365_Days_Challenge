package com.demotivirus.Day_065_067.model;

import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity @NoArgsConstructor
@Table(name = "chinese")
public class Chinese extends AbstractLanguage {
    public Chinese(@NonNull String word) {
        super(word);
    }

    //====================WORDS=======================
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            },
            mappedBy = "chineseWords")
    public List<Russian> russianWords = new ArrayList<>();

    public void addRussianWord(Russian russian){
        russianWords.add(russian);
    }

    public void addRussianWord(String word){
        russianWords.add(new Russian(word));
    }

    //ENGLISH

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            },
            mappedBy = "chineseWords")
    public List<English> englishWords = new ArrayList<>();

    public void addEnglishWord(English english){
        englishWords.add(english);
    }

    public void addEnglishWord(String word){
        englishWords.add(new English(word));
    }
}
