package com.demotivirus.Day_052_Dictionary.dao;

import com.demotivirus.Day_052_Dictionary.model.Rus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RusDao extends JpaRepository<Rus, Long> {
    Rus findByWord(String word);
}
