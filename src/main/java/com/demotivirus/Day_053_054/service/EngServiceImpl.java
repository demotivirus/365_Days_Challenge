package com.demotivirus.Day_053_054.service;

import com.demotivirus.Day_024.error.NotFoundException;
import com.demotivirus.Day_053_054.dao.EngDao;
import com.demotivirus.Day_053_054.model.Eng;
import com.demotivirus.Day_053_054.model.Rus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EngServiceImpl implements EngService {
    @Autowired
    private EngDao engDao;

    @Override
    public void saveWord(Eng eng) {
        engDao.save(eng);
    }

    @Override
    public Eng updateWord(Eng eng) {
        Eng engOnDb = engDao.getOne(eng.getId());
        if (engOnDb != null){
            engOnDb.setId(eng.getId());
            engOnDb.setWord(eng.getWord());
            return engOnDb;
        }
        else throw new NotFoundException("Not found with id " + eng.getId());
    }

    @Override
    public List<Eng> getAllWords() {
        return engDao.findAll();
    }

    @Override
    public Eng getWordById(Long id) {
        Eng engOnDb = engDao.getOne(id);
        if (engOnDb != null)
            return engOnDb;
        else throw new NotFoundException("Not found with id " + id);
    }

    @Override
    public void deleteWord(Long id) {
        Eng engOnDb = engDao.getOne(id);
        if (engOnDb != null)
            engDao.delete(engOnDb);
        else throw new NotFoundException("Not found with id " + id);
    }

    @Override
    public void saveEngTranslation(Eng eng, Rus rus) {
        eng.addRusTranslation(rus);
        engDao.save(eng);
    }
}
