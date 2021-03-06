package com.demotivirus.Day_075.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity @NoArgsConstructor
@Table(name = "russian")
public class Russian extends AbstractLanguage {

    public Russian(@NonNull String word) {
        super(word);
    }

    public Russian(@NonNull Long id) {
        super(id);
    }

    //====================WORDS=======================
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(
            name = "russian_english",
            joinColumns = @JoinColumn(name = "russian_id"),
            inverseJoinColumns = @JoinColumn(name = "english_id")
    )
    private List<English> englishWords = new ArrayList<>();

    public void addEnglishWord(English english){
        englishWords.add(english);
    }

    public void addEnglishWord(String word){
        englishWords.add(new English(word));
    }

    //CHINESE

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(
            name = "russian_chinese",
            joinColumns = @JoinColumn(name = "russian_id"),
            inverseJoinColumns = @JoinColumn(name = "chinese_id")
    )
    public List<Chinese> chineseWords = new ArrayList<>();

    public void addChineseWord(Chinese chinese){
        chineseWords.add(chinese);
    }

    public void addChineseWord(String word){
        chineseWords.add(new Chinese(word));
    }

    //=================PHRASES========================

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(
            name = "russian_phrases_relationship",
            joinColumns = @JoinColumn(name = "russian_id"),
            inverseJoinColumns = @JoinColumn(name = "phrase_id")
    )
    public List<RussianPhrase> russianPhrases = new ArrayList<>();

    public void addRussianPhrase(RussianPhrase russianPhrase){
        russianPhrases.add(russianPhrase);
    }
}
