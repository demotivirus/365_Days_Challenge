package com.demotivirus.Day_065_067.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@Data
@MappedSuperclass
public abstract class AbstractPhrase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phrase")
    private String phrase;

    @Transient
    private String phraseTranslation;

    @Override
    public String toString() {
        return "" + phrase;
    }
}
