package com.serviceCommunication.EmployeeService.repository;

import com.serviceCommunication.EmployeeService.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
