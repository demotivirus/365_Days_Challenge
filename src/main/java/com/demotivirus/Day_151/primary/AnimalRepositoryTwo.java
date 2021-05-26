package com.demotivirus.Day_151.primary;

import org.springframework.stereotype.Repository;

@Repository
public class AnimalRepositoryTwo implements AnimalRepository {

    @Override
    public void save() {
        System.out.println("Save animal two");
    }
}
