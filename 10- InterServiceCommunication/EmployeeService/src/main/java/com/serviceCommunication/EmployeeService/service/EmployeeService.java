package com.serviceCommunication.EmployeeService.service;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.serviceCommunication.EmployeeService.model.Employee;
import com.serviceCommunication.EmployeeService.repository.EmployeeRepository;
import com.serviceCommunication.EmployeeService.response.AddressClient;
import com.serviceCommunication.EmployeeService.response.AddressResponse;
import com.serviceCommunication.EmployeeService.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    AddressClient addressClient;
    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
        AddressResponse addressResponse =addressClient.getAddressByEmpId(id).getBody();
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

    @Autowired
    EmployeeRepository employeeRepository;
    ModelMapper modelMapper;
    public Employee addEmployee(Employee employee) {
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeRepository.findAll());
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        return new Employee();
    }

    public void deleteEmployee(int id) {
    }
}