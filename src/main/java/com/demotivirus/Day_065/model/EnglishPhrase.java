package com.demotivirus.Day_065.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity @Data
@Table(name = "english_phrases")
public class EnglishPhrase extends AbstractPhrase {
    //====================WORDS=======================
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            },
            mappedBy = "englishPhrases")
    public List<English> englishWords = new ArrayList<>();

    public void addEnglishWord(English english){
        englishWords.add(english);
    }
}
