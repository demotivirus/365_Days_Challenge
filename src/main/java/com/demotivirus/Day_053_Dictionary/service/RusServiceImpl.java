package com.demotivirus.Day_053_Dictionary.service;

import com.demotivirus.Day_024.error.NotFoundException;
import com.demotivirus.Day_053_Dictionary.dao.RusDao;
import com.demotivirus.Day_053_Dictionary.model.Rus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RusServiceImpl implements RusService {
    @Autowired
    private RusDao rusDao;

    @Override
    public void saveWord(Rus rus) {
        rus.setWord(rus.getWord().toLowerCase());
        if (findIdByWord(rus.getWord()) == null)
            rusDao.save(rus);
    }

    @Override
    public Rus updateWord(Rus rus) {
        return rusDao.save(rus);
    }

    @Override
    public List<Rus> getAllWords() {
        return rusDao.findAll();
    }

    @Override
    public Rus getRusById(Long id) {
       var rus = rusDao.getOne(id);
       if (rus != null)
           return rusDao.getOne(id);
       else throw new NotFoundException("Not found with id " + id);
    }

    @Override
    public void deleteWord(Long id) {
        Optional<Rus> rus = Optional.of(rusDao.getOne(id));
        if (rus.isPresent())
            rusDao.delete(rus.get());
        else throw new NotFoundException("Not found with id " + id);
    }

    @Override
    public void saveEngTranslation(Rus rus) {
        rus.setWord(rus.getWord().toLowerCase());

        if (findIdByWord(rus.getWord()) == null) {
            Rus parseRus = new Rus();
            parseRus.setWord(rus.getWord());
            parseRus.addRusEng(rus.getTranslationWord());
            rusDao.save(parseRus);
        }
        else {
            Rus findingRus = rusDao.getOne(findIdByWord(rus.getWord()));
            List<String> allEngWordsByRusId = findAllEngWordsByRusId(rusDao.findIdByWord(rus.getWord()));
            if (!allEngWordsByRusId.contains(rus.getTranslationWord())){
                System.err.println("Not contain " + rus.getTranslationWord());

                findingRus.addRusEng(rus.getTranslationWord());

                System.err.println("id " + findingRus.getId() + " translation " + findingRus.getTranslationWord());
                System.err.println(Arrays.asList(findingRus.getRusEng()));
                rusDao.save(findingRus);
            }
        }
    }

//    @Override
//    public Rus findByWord(String word) {
//        return rusDao.findByWord(word);
//    }

    @Override
    public Long findIdByWord(String word) {
        System.err.println("Find id by " + word + " is: " + rusDao.findByWord(word).getId());
        return rusDao.findIdByWord(word);
    }

    @Override
    public List<String> findAllEngWordsByRusId(Long id) {
        List<String> allEngWordsByRusId = rusDao.findAllEngWordsByRusId(id);
        for (String s : allEngWordsByRusId)
            System.err.println(s);
        return allEngWordsByRusId;
    }

}
