package com.crud.demo.service;

import java.util.List;

import com.crud.demo.model.Employee;

public interface EmployeeService {
	Employee saveEployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee,long id);
	
	void deleteEmployee(long id);
}
