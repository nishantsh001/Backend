package net.backend.service;

import java.util.List;

import net.backend.entity.EmployeeEntity;

public interface EmployeeService{
	List<EmployeeEntity> getAllEmployeeEntities();
	EmployeeEntity getEmployeeById(int id);
	EmployeeEntity createEmployeeEntity(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployeeEntity(int id, EmployeeEntity employeeEntity);
	void deleteById(int id);	
}
