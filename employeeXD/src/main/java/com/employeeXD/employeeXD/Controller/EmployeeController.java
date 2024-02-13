package com.employeeXD.employeeXD.Controller;

import com.employeeXD.employeeXD.entity.EmployeeEntity;
import com.employeeXD.employeeXD.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public List<EmployeeEntity> findAllEmployee() {
		return employeeService.findAllEmployee();
	}

	@GetMapping("/id")
	public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") long id) {
		return employeeService.findById(id);
	}

	@PostMapping
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.saveEmployee(employeeEntity);
	}

	@PutMapping
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.updateEmployee(employeeEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployee(id);

	}

}
