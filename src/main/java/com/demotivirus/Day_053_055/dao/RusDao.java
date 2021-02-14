package com.demotivirus.Day_053_055.dao;

import com.demotivirus.Day_053_055.model.Rus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RusDao extends JpaRepository<Rus, Long> {
    Rus findByWord(String word);

    @Query("SELECT r.id FROM Rus r WHERE r.word = :word")
    Long findIdByWord(String word);

    @Query(value =
            "SELECT e.word FROM public.rus_eng as re " +
                    "LEFT JOIN eng e on e.id = re.eng_id WHERE re.rus_id = :id", nativeQuery = true)
    List<String> findAllEngWordsByRusId(Long id);

    Rus findFirstById(Long id);
}
