package com.demotivirus.Day_053_055.service;

import com.demotivirus.Day_024.error.NotFoundException;
import com.demotivirus.Day_053_055.dao.EngDao;
import com.demotivirus.Day_053_055.dao.RusDao;
import com.demotivirus.Day_053_055.model.Eng;
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
    @Autowired
    private EngDao engDao;

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
        if (word != null) {
            wordInDb = word.getWord();
        }
        if (!wordInDb.equals(rus.getWord())) {
            Rus parseRus = getById(rus.getId());
            parseRus.setWord(rus.getWord());
            rusDao.save(parseRus);
        } else System.err.println("Word [" + rus.getWord() + "] is exist. Don't update!");
    }

    @Override
    public List<Rus> getAllWords() {
        return rusDao.findAll();
    }

    @Override
    public Rus getById(Long id) {
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

        if (rus.getId() == null) { //FOR FORM ON @GetMapping("add-eng-translation")
            Rus parseRus = new Rus();
            parseRus.setWord(rus.getWord());
            parseRus.addRusEng(rus.getTranslationWord());
            rusDao.save(parseRus);
        } else { //FOR FORM ON @GetMapping("add-eng-translation/{id}")
            Rus parseRus = getById(rus.getId());
            List<String> allRusToEngTranslations = findAllRusToEngTranslations(rus.getId());
            System.err.print("IN saveEngTranslation RUS ");
            if (!allRusToEngTranslations.contains(rus.getTranslationWord())) { //save only uniq words

                Eng eng = engDao.findFirstByWord(rus.getTranslationWord());
                if (eng != null) {
                    System.err.print("& IN saveEngTranslation ENG: ");
                    List<String> allEngToRusTranslations = findAllEngToRusTranslations(eng.getId());
                    if (!allEngToRusTranslations.contains(parseRus.getWord())) { //save only uniq words

                        eng.addRusTranslation(parseRus); //save eng-rus
                        parseRus.addRusEng(eng); //save rus-eng
                        rusDao.save(parseRus); //SAVE ALL

                        System.err.println("Add to word [" + eng.getWord() + "] translation [" + parseRus.getWord() + "]");
                    }
                    //if ENG word not exist
                } else {
                    parseRus.addRusEng(rus.getTranslationWord());
                    rusDao.save(parseRus);
                    System.err.println("Add to word [" + parseRus.getWord() + "] translation [" + rus.getTranslationWord() + "]");
                }

            } else System.err.println("Not add " + rus.getTranslationWord() + " because translation exists");
        }
    }

    @Override
    public Long findIdByWord(String word) {
        return rusDao.findIdByWord(word);
    }

    @Override
    public List<String> findAllRusToEngTranslations(Long id) {
        List<String> allRusToEngTranslations = rusDao.findAllEngWordsByRusId(id);
        return allRusToEngTranslations;
    }

    private List<String> findAllEngToRusTranslations(Long id) {
        List<String> allEngToRusTranslations = engDao.findAllRusWordsByEngId(id);
        return allEngToRusTranslations;
    }
}
