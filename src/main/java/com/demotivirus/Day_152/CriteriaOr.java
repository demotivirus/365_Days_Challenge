package com.demotivirus.Day_152;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CriteriaOr implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> second = otherCriteria.meetCriteria(persons);

        for (Person person : second) {
            if (!first.contains(person))
                first.add(person);
        }
        return first;
    }
}
