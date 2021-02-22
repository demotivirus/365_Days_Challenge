package com.demotivirus.Day_063.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity @Data
@Table(name = "russian_phrases")
public class RussianPhrase extends AbstractPhrase {
    //====================WORDS=======================
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            },
            mappedBy = "russianPhrases")
    public List<Russian> russianWords = new ArrayList<>();

    public void addRussianWords(Russian russian){
        russianWords.add(russian);
    }
}
