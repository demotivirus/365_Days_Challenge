package com.demotivirus.Day_052_Dictionary.service;

import com.demotivirus.Day_024.error.NotFoundException;
import com.demotivirus.Day_052_Dictionary.dao.RusDao;
import com.demotivirus.Day_052_Dictionary.model.Rus;
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
        Rus parseRus = new Rus();
        parseRus.setWord(rus.getWord());
        if (findByWord(rus.getWord()) == null)
            rusDao.save(parseRus);
        else new RuntimeException("This word not uniq");
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
        if (findByWord(rus.getWord()) == null) {
            Rus parseRus = new Rus();
            parseRus.setWord(rus.getWord());
            parseRus.addRusEng(rus.getTranslationWord());

            rusDao.save(parseRus);
        }
//        if (findByWord(rus.getWord()) != null){
//            List<Eng> rusEng = rusDao.getOne(rus.getId()).getRusEng();
//            for (Eng eng : rusEng){
//                if (eng.getWord().equals(rus.getTranslationWord().toLowerCase()))
//                    return;
//            }
//            Rus parseRus = new Rus();
//            parseRus.setWord(rus.getWord());
//            parseRus.addRusEng(rus.getTranslationWord());
//            rusDao.save(parseRus);
//        }
    }

    @Override
    public Rus findByWord(String word) {
        return rusDao.findByWord(word);
    }

}
