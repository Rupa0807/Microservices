package com.serviceCommunication.EmployeeService.response;


public class EmployeeResponse {

    String name;
    int empId;
    String email;
    AddressResponse addressResponse;


    public AddressResponse getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(AddressResponse addressResponse) {
        this.addressResponse = addressResponse;
    }

    public EmployeeResponse() {
    }

    public EmployeeResponse(AddressResponse addressResponse, String email, int empId, String name) {
        this.addressResponse = addressResponse;
        this.email = email;
        this.empId = empId;
        this.name = name;
    }

    public EmployeeResponse(String email, int empId, String name) {
        this.email = email;
        this.empId = empId;
        this.name = name;
    }


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

