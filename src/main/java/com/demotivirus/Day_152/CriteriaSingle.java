package com.demotivirus.Day_152;

import com.demotivirus.Day_152.constants.MaritalStatus;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();

        for (Person person : persons) {
            if (person.getMaritalStatus() == MaritalStatus.SINGLE)
                personList.add(person);
        }
        return personList;
    }
}
