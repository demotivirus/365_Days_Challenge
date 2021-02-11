package com.demotivirus.Day_052_Dictionary.service;

import com.demotivirus.Day_024.error.NotFoundException;
import com.demotivirus.Day_052_Dictionary.dao.RusDao;
import com.demotivirus.Day_052_Dictionary.model.Eng;
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
        rusDao.save(rus);
    }

    @Override
    public Rus updateWord(Rus rus) {
        Rus rusOnDb = rusDao.getOne(rus.getId());
        if (rusOnDb != null){
            rusOnDb.setId(rus.getId());
            rusOnDb.setWord(rus.getWord());
            return rusOnDb;
        }

        else throw new NotFoundException("Not found with id " + rus.getId());
    }

    @Override
    public List<Rus> getAllWords() {
        return rusDao.findAll();
    }

    @Override
    public Rus getWordById(Long id) {
       var rus = rusDao.getOne(id);
       if (rus != null)
           return rus;
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
    public void saveEngTranslation(Rus rus, Eng eng) {
        rus.addEngTranslation(eng);
        rusDao.save(rus);
    }
}
