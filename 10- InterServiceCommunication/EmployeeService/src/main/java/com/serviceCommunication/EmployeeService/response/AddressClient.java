package com.serviceCommunication.EmployeeService.response;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Address-Service",url = "http://localhost:8082/api/")
public interface AddressClient {
    @GetMapping("/addresses/{empId}")
    ResponseEntity<AddressResponse> getAddressByEmpId(@PathVariable int empId);
}
