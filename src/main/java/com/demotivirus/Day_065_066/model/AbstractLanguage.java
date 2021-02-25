package com.demotivirus.Day_065_066.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@Data
@MappedSuperclass
public abstract class AbstractLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "word")
    private String word;

    @Transient
    private String translationWord;

    @Override
    public String toString() {
        return "" + word;
    }
}
