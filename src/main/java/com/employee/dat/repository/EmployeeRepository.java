package com.employee.dat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.dat.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
