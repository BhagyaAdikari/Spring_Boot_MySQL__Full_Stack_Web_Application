package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}
