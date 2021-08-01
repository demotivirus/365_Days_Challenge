package com.demotivirus.Day_214.Tip_09;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male"))
                result.add(person);
        }
        return result;
    }
}
