package com.rajivgiri.angularjs.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajivgiri.angularjs.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByName(String name);
	
	
	
	
}
