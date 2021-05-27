package com.demotivirus.Day_152;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CriteriaAnd implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(first);
    }
}
