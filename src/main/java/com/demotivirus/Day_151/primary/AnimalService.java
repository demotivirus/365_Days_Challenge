package com.demotivirus.Day_151.primary;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class AnimalService {
    private final AnimalRepository animalRepository;

    public void save() {
        animalRepository.save();
    }
}
