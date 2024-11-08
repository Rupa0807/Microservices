package com.SpringBoot.AddressService.controller;

import com.SpringBoot.AddressService.dto.AddressDTO;
import com.SpringBoot.AddressService.entity.Address;
import com.SpringBoot.AddressService.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{empId}")
    ResponseEntity<AddressDTO> getAddressByEmpId(@PathVariable("empId") int empId){


        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(addressService.getAddressByEmpId(empId));
    }
}
