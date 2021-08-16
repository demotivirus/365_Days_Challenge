package com.demotivirus.Day_228.Tip_10;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> employees;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.employees = new ArrayList<>();
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public void remove(Employee e) {
        employees.remove(e);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}
