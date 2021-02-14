package com.demotivirus.Day_053_055.service;

import com.demotivirus.Day_024.error.NotFoundException;
import com.demotivirus.Day_053_055.dao.RusDao;
import com.demotivirus.Day_053_055.model.Rus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void updateWord(Rus rus) {
        rus.setWord(rus.getWord().toLowerCase());
        Rus word = rusDao.findByWord(rus.getWord());
        String wordInDb = "";
        if (word != null){
            wordInDb = word.getWord();
        }
        if (!wordInDb.equals(rus.getWord())){
            Rus parseRus = getRusById(rus.getId());
            parseRus.setWord(rus.getWord());
            rusDao.save(parseRus);
        }
        else System.err.println("Word [" + rus.getWord() + "] is exist. Don't update!");
    }

    @Override
    public List<Rus> getAllWords() {
        return rusDao.findAll();
    }

    @Override
    public Rus getRusById(Long id) {
       //var rus = rusDao.getOne(id);
       Rus rus = rusDao.findFirstById(id);
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
        if (rus.getWord() != null) {
            rus.setWord(rus.getWord().toLowerCase());
        }
        if (rus.getTranslationWord() != null) {
            rus.setTranslationWord(rus.getTranslationWord().toLowerCase());
        }

        if (rus.getId() == null){
            Rus parseRus = new Rus();
            parseRus.setWord(rus.getWord());
            parseRus.addRusEng(rus.getTranslationWord());
            rusDao.save(parseRus);
        }
        else {
            Rus parseRus = getRusById(rus.getId());
            List<String> allEngWordsByRusId = findAllEngWordsByRusId(rus.getId());
            if (!allEngWordsByRusId.contains(rus.getTranslationWord())) {
                System.err.println("Not contain " + rus.getTranslationWord());
                parseRus.addRusEng(rus.getTranslationWord());
                rusDao.save(parseRus);
                System.err.println("Add to word [" + parseRus.getWord() + "] translation [" + rus.getTranslationWord() + "]");
            } else System.err.println("Not add " + rus.getTranslationWord() + " because translation exists");
        }
    }

    @Override
    public Long findIdByWord(String word) {
        return rusDao.findIdByWord(word);
    }

    @Override
    public List<String> findAllEngWordsByRusId(Long id) {
        List<String> allEngWordsByRusId = rusDao.findAllEngWordsByRusId(id);
        return allEngWordsByRusId;
    }
}
