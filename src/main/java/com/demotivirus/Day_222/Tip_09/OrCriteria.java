package com.demotivirus.Day_222.Tip_09;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria nextCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> next = nextCriteria.meetCriteria(persons);

        for (Person person : next) {
            if (!first.contains(person)) {
                first.add(person); //add as in bubble sort
            }
        }

        return first;
    }
}
