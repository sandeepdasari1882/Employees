package com.ihub.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihub.www.service.EmployeeService;
import com.ihub.www.model.Employee;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() 
	{
		return employeeService.getAllEmployees();	
	}

}
