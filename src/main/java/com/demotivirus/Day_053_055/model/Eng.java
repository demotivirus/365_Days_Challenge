package com.demotivirus.Day_053_055.model;

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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "eng")
@Getter @Setter
@RequiredArgsConstructor
public class Eng {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "word")
    private String word;

    @Transient
    private String translationWord;

    public Eng(String word){
        this.word = word;
    }

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            },
            mappedBy = "rusEng")
    private List<Rus> engRus = new ArrayList<>();

    public void addRusTranslation(String word){
        //engRus.add(rus);
        //rus.getRusEng().add(this);
        engRus.add(new Rus(word));
    }

    public void addRusTranslation(Rus rus){
        engRus.add(rus);
    }

    @Override
    public String toString() {
        return "" + word;
    }
}
