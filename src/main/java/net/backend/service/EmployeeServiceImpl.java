package net.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.backend.entity.EmployeeEntity;
import net.backend.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeEntity> getAllEmployeeEntities() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeEntity getEmployeeById(int id) {
	    return employeeRepository.findById(id)
	        .orElse(null);
	}

	@Override
	public EmployeeEntity createEmployeeEntity(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
		return employeeEntity;
	}

	@Override
	public EmployeeEntity updateEmployeeEntity(int id, EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}
	
}
