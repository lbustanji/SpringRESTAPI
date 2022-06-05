package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
