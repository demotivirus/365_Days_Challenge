package com.demotivirus.Day_228.Tip_09;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female"))
                result.add(person);
        }
        return result;
    }
}
