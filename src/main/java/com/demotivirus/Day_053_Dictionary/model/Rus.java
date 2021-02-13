package com.demotivirus.Day_053_Dictionary.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rus")
@Getter @Setter
@RequiredArgsConstructor
public class Rus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "word")
    private String word;

    @Transient
    private String translationWord;

    public Rus(String translationWord){
        this.translationWord = translationWord;
    }

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(
            name = "rus_eng",
            joinColumns = @JoinColumn(name = "rus_id"),
            inverseJoinColumns = @JoinColumn(name = "eng_id")
    )
    private List<Eng> rusEng = new ArrayList<>();

    public void addRusEng(String word){
        rusEng.add(new Eng(word));
    }

    @Override
    public String toString() {
        return "" + word;
    }
}
