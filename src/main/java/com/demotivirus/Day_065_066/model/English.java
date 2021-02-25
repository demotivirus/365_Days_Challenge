package com.demotivirus.Day_065_066.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "english")
public class English extends AbstractLanguage {
    //====================WORDS=======================
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            },
            mappedBy = "englishWords")
    public List<Russian> russianWords = new ArrayList<>();

    public void addRussianWord(Russian russian){
        russianWords.add(russian);
    }

    //=================PHRASES========================

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(
            name = "english_phrases_relationship",
            joinColumns = @JoinColumn(name = "english_id"),
            inverseJoinColumns = @JoinColumn(name = "phrase_id")
    )
    public List<EnglishPhrase> englishPhrases = new ArrayList<>();

    public void addEnglishPhrase(EnglishPhrase englishPhrase){
        englishPhrases.add(englishPhrase);
    }
}
