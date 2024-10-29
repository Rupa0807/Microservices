package com.SpringBoot.AddressService.controller;

import com.SpringBoot.AddressService.dto.AddressDTO;
import com.SpringBoot.AddressService.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO> getAddressByEmpId(@PathVariable("id") int empId) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(addressService.getAddressByEmpId(empId));
    }

    @PostMapping
    public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO) {
        AddressDTO savedAddress = addressService.saveAddress(addressDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAddress);
    }
}

