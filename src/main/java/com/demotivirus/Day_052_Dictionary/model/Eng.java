package com.demotivirus.Day_052_Dictionary.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, doNotUseGetters = true)
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

    @ManyToMany(mappedBy = "rusEng")
    private List<Rus> engRus = new ArrayList<>();

    public void addRusTranslation(Rus rus){
        //engRus.add(rus);
        rus.getRusEng().add(this);
    }

    @Override
    public String toString() {
        return "" + word;
    }
}
