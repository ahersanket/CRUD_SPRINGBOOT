package com.example.CRUDApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.CRUDApplication.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

}