package com.serviceCommunication.EmployeeService.controller;


import com.serviceCommunication.EmployeeService.model.Employee;
import com.serviceCommunication.EmployeeService.response.EmployeeResponse;
import com.serviceCommunication.EmployeeService.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Read All
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, updatedEmployee));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}

/*@RestController
public class EmployeeController {
private final EmployeeService employeeService;
     @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable("id") int id) {
     return ResponseEntity.status(HttpStatus.FOUND).body(employeeService.getEmployeeById(id));


    }
}
*/

//


