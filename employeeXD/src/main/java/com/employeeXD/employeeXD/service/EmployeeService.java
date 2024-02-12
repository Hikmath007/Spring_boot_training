package com.employeeXD.employeeXD.service;

import com.employeeXD.employeeXD.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
	List<EmployeeEntity> findAllEmployee();
	Optional<EmployeeEntity> findById(long id);//get
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);// save
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);//update
	void deleteEmployee(long id);  // delete
}
