package com.serviceCommunication.EmployeeService.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
