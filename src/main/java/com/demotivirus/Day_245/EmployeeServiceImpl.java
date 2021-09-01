package com.demotivirus.Day_245;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeDao employeeDao;

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeDao.save(employee);
    }

    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeDao.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id) {
        return employeeDao.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " not found"));
    }
}
