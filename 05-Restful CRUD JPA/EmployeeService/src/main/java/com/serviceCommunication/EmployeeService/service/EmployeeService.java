package com.serviceCommunication.EmployeeService.service;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.serviceCommunication.EmployeeService.model.Employee;
import com.serviceCommunication.EmployeeService.repository.EmployeeRepository;
import com.serviceCommunication.EmployeeService.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        // Create
        public Employee addEmployee(Employee employee) {
            return employeeRepository.save(employee);
        }

        // Read All
        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        // Update
        public Employee updateEmployee(int id, Employee updatedEmployee) {
            Employee employee = employeeRepository.findById(id).orElseThrow();
            employee.setName(updatedEmployee.getName());
            employee.setEmail(updatedEmployee.getEmail());
            return employeeRepository.save(employee);
        }

        // Delete
        public void deleteEmployee(int id) {
            employeeRepository.deleteById(id);
        }
    }

 /*  @Autowired
   ModelMapper modelMapper;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeResponse getEmployeeById(int id) {


        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()){
            return modelMapper.map(employee,EmployeeResponse.class);}

            return null;


    }

    public void deleteEmployee(int id) {
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
    }

    public Employee addEmployee(Employee employee) {
    }

    public List<Employee> getAllEmployees() {
    }*/
