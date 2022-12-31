package com.example.CRUDApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.CRUDApplication.model.Employee;
import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

    @Query("select u from Employee u ")
public List<Employee> getEmployee();

   // @Query ("Select u FROM Employee u WHERE firstName LIKE 'S%'")
   // public List<Employee> getEmployeeNamefromH();
}