package com.demotivirus.Day_151.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary //set as bean first
@Repository
public class AnimalRepositoryOne implements AnimalRepository {
    @Override
    public void save() {
        System.out.println("Save first animal");
    }
}
