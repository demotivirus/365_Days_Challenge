package com.demotivirus.Day_152;

import com.demotivirus.Day_152.constants.Gender;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender() == Gender.MALE)
                personList.add(person);
        }
        return personList;
    }
}
