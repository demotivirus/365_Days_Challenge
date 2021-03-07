package com.demotivirus.Day_076.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@Getter @Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractLanguage {
    private long id;
    private String word;
    @Transient
    private String transactionWord;

    @Override
    public String toString() {
        return "".concat(word);
    }
}
