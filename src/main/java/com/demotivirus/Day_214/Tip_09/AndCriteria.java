package com.demotivirus.Day_214.Tip_09;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria nextCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        return nextCriteria.meetCriteria(first);
    }
}
