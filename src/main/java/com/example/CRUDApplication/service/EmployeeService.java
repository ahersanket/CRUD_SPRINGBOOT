package com.example.CRUDApplication.service;

import com.example.CRUDApplication.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

    public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById( int id);
    public void DeleteEmployeebyID( int id);
    public void saveOrUpdate(Employee employee);
    public void delete(int id);
    public List<Employee> getEmployee();
    //public List<Employee> getEmployeeNamefromH();


    }
