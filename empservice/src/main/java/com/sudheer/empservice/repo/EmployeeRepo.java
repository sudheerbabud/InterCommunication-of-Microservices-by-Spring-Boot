package com.sudheer.empservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudheer.empservice.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
