package com.demotivirus.Day_101.controller;

import com.demotivirus.Day_021.NotFoundException;
import com.demotivirus.Day_101.entity.Employee;
import com.demotivirus.Day_101.exception.Fault;
import com.demotivirus.Day_101.exception.Group;
import com.demotivirus.Day_101.exception.ResourceNotFoundException;
import com.demotivirus.Day_101.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getAll(){
        return employeeService.findAll();
    }

    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") Long id){
        return employeeService.getOne(id).orElseThrow(() -> new Fault("Not found"));
    }
}
