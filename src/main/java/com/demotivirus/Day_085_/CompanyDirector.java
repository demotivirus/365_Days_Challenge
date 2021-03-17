package com.demotivirus.Day_085_;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class CompanyDirector implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void add(Employee employee){
        employees.add(employee);
    }

    public void remove(Employee employee){
        employees.remove(employee);
    }
}
