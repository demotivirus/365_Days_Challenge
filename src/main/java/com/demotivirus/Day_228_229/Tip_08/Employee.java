package com.demotivirus.Day_228_229.Tip_08;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@RequiredArgsConstructor
public class Employee {
    @NonNull
    private String name;

    @NonNull
    private String department;

    @NonNull
    private int salary;

    private List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
