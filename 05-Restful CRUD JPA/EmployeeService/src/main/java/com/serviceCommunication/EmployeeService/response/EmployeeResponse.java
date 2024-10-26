package com.serviceCommunication.EmployeeService.response;



public class EmployeeResponse {

    String name;

    public EmployeeResponse() {
    }

    public EmployeeResponse(String email, int empId, String name) {
        this.email = email;
        this.empId = empId;
        this.name = name;
    }

    int empId;
    String email;

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


}

