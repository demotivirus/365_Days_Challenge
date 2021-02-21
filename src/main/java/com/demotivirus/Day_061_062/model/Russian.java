package com.demotivirus.Day_061_062.model;

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
@Table(name = "russian")
public class Russian extends AbstractLanguage {
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(
            name = "russian_english",
            joinColumns = @JoinColumn(name = "russian_id"),
            inverseJoinColumns = @JoinColumn(name = "english_id")
    )
    public List<English> englishWords = new ArrayList<>();

    public void addEnglishWord(English english){
        englishWords.add(english);
    }
}
