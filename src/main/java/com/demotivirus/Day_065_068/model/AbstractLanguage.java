package com.demotivirus.Day_065_068.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@Data @NoArgsConstructor
@RequiredArgsConstructor
@MappedSuperclass
public abstract class AbstractLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "word")
    private String word;

    @Transient
    private String translationWord;

    @Override
    public String toString() {
        return "" + word;
    }


    public AbstractLanguage(Long id) {
        this.id = id;
    }
}
