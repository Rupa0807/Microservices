package com.serviceCommunication.EmployeeService.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="Employee")

public class Employee {
    public Employee(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Employee() {
    }

    String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int empId;
    String email;
}
