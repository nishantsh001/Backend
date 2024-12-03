package net.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.backend.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
