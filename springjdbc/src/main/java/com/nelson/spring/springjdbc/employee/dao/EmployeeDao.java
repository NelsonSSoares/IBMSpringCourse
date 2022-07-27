package com.nelson.spring.springjdbc.employee.dao;

import com.nelson.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
}
