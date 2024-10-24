package com.Microservices.SpringDemo.controller;

import com.Microservices.SpringDemo.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
   
    private GreetingService greetingService;
    @Autowired
    public GreetingController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String greeting(){
    return greetingService.greeting();

    }
}
