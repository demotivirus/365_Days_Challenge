package com.demotivirus.Day_122;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    public List<Car> findAll() {
        return carDao.findAll();
    }

    public Optional<Car> findById(long id) {
        return carDao.findById(id);
    }
}
