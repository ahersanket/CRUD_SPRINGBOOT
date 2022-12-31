package com.example.CRUDApplication.serviceImpl;

import com.example.CRUDApplication.exception.ResourceNotFoundException;
import com.example.CRUDApplication.model.Employee;
import com.example.CRUDApplication.repo.EmployeeRepo;
import com.example.CRUDApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employee = new ArrayList<Employee>();
        employeeRepo.findAll().forEach(employees -> employee.add(employees));
        return employee;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","ID",id));
    }

    @Override
    public void DeleteEmployeebyID(int id) {

        employeeRepo.deleteById(id);
    }

    public void saveOrUpdate(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> getEmployee() {
        List<Employee> employees = employeeRepo.getEmployee();
        System.out.println(employees);
        return employees;
    }
}
   // @Override
    //public List<Employee> getEmployeeNamefromH() {
       // List<Employee> employeess = employeeRepo.getEmployeeNamefromH();
      //  System.out.println(employeess);
      //  return employeess;
   // }
//}

