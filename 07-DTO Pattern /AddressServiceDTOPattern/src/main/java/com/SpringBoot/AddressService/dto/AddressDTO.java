package com.SpringBoot.AddressService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddressDTO {
    private Long id;
    private String lane1;
    private String lane2;
    private String city;
    private String state;
    private String zip;
    private String empId;
}
