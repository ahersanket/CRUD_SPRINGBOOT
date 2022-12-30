package com.example.CRUDApplication.controller;

import java.util.*;

import com.example.CRUDApplication.model.Employee;
import com.example.CRUDApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	private List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}

	@GetMapping("/employee/{id}")
	private Employee getEmployeeById(@PathVariable("id") Integer id)
	{
		return employeeService.getEmployeeById(id);
	}

	@DeleteMapping("/employee/{id}")
	private void DeleteEmployeebyID(@PathVariable("id") int id)
	{
		employeeService.delete(id);
	}
	//creating post mapping that post the book detail in the database
	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee)
	{
		employeeService.saveOrUpdate(employee);
		return employee.getId();
	}

	//creating put mapping that updates the book detail
	@PutMapping("/employee/{id}")
	private Employee update(@RequestBody Employee employee)
	{
		employeeService.saveOrUpdate(employee);
		return employee;
	}
}
