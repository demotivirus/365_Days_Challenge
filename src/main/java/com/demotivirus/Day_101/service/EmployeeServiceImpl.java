package com.demotivirus.Day_101.service;

import com.demotivirus.Day_101.dao.EmployeeDao;
import com.demotivirus.Day_101.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Optional<Employee> getOne(Long id) {
        return employeeDao.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }
}
