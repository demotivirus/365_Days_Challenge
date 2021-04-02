package com.demotivirus.Day_101.service;

import com.demotivirus.Day_101.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> getOne(Long id);
    void save(Employee employee);
}
