package com.demotivirus.Day_151.qualifier;

import com.demotivirus.Day_004.Animal;
import com.demotivirus.Day_151.primary.AnimalRepository;
import com.demotivirus.Day_151.primary.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceQualifier {
    private AnimalRepository animalRepository;

    @Autowired
    public AnimalServiceQualifier(@Qualifier("animalRepositoryTwo") AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void save() {
        animalRepository.save();
    }
}
