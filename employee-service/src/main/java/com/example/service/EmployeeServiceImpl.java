package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> fetchAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    @Override
    @Transactional
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {
        Employee empObj = employeeRepository.findById(employee.getId())
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + employee.getId()));
        
        empObj.setEmail(employee.getEmail());
        empObj.setName(employee.getName());
        empObj.setSalary(employee.getSalary());
        
        return employeeRepository.save(empObj);
    }

    @Override
    @Transactional
    public String deleteEmployee(Long id) {
        Employee empObj = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
        
        employeeRepository.delete(empObj);
        return "Employee Deleted Successfully for ID: " + id;
    }
}
