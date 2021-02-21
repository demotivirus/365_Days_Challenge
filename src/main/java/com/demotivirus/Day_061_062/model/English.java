package com.demotivirus.Day_061_062.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "english")
public class English extends AbstractLanguage {
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            },
            mappedBy = "englishWords")
    public List<Russian> russianWords = new ArrayList<>();

    public void addRussianWord(Russian russian){
        russianWords.add(russian);
    }
}
