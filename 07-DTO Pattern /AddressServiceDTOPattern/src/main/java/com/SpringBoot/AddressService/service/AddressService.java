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
    private final ModelMapper modelMapper;
@Autowired
    public AddressService(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

 //   @Autowired
    private final AddressRepository addressRepository;
    public AddressDTO getAddressByEmpId(int empId) {
        Address address= addressRepository.findByEmpId(empId);
        AddressDTO addressDTO;
        addressDTO = modelMapper.map(address, AddressDTO.class);
        return addressDTO;
    }

    public AddressDTO saveAddress(AddressDTO addressDTO) {
       Address address= modelMapper.map(addressDTO,Address.class);
        addressRepository.save(address);
         return  modelMapper.map(address,AddressDTO.class);
    }
}
