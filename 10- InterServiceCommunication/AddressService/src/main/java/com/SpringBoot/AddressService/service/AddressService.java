package com.SpringBoot.AddressService.service;

import com.SpringBoot.AddressService.dto.AddressDTO;
import com.SpringBoot.AddressService.entity.Address;
import com.SpringBoot.AddressService.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
  //  @Autowired
    private ModelMapper modelMapper;
@Autowired
    public AddressService(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

 //   @Autowired
    private AddressRepository addressRepository;
    public AddressDTO getAddressByEmpId(int empId) {
        Address address= addressRepository.findByEmpId(empId);
        AddressDTO addressDTO =  modelMapper.map(address, AddressDTO.class);
       return addressDTO;
    }
}
