package com.demotivirus.Day_060.dao;

import com.demotivirus.Day_060.model.Eng;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EngDao extends JpaRepository<Eng, Long> {
    @Query("SELECT e.id FROM Eng e WHERE e.word = :word")
    Long findIdByWord(String word);

    @Query(value =
            "SELECT r.word FROM public.rus_eng as re " +
                    "LEFT JOIN rus r on r.id = re.rus_id WHERE re.eng_id = :id", nativeQuery = true)
    List<String> findAllRusWordsByEngId(Long id);

    Eng findFirstById(Long id);

    Eng findByWord(String word);

    Eng findFirstByWord(String word);
}
