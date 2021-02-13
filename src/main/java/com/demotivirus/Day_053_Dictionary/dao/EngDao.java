package com.demotivirus.Day_053_Dictionary.dao;

import com.demotivirus.Day_053_Dictionary.model.Eng;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EngDao extends JpaRepository<Eng, Long> {
    @Query("SELECT e.id FROM Eng e WHERE e.word = :word")
    Long findIdByWord(String word);
}
