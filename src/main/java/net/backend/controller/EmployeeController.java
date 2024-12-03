package net.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.backend.entity.EmployeeEntity;
import net.backend.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<EmployeeEntity> getAllEmployees(){
		return employeeService.getAllEmployeeEntities();
	}
	
	@GetMapping("/{id}")
	public EmployeeEntity getEmployeeById(@PathVariable int id){
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping
	public EmployeeEntity createEmployeeEntity(@RequestBody EmployeeEntity employeeEntity){
		return employeeService.createEmployeeEntity(employeeEntity);
	}
	
    @DeleteMapping("/{id}")
	public void deletById(@PathVariable int id) {
		 employeeService.deleteById(id);
	}
}
