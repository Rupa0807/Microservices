package com.Microservices.SpringDemo.Service;

import org.springframework.stereotype.Service;

import java.net.SocketTimeoutException;
@Service
public class GreetingService {
    public String greeting() {
        return "Hello Spring Bean!";
    }
}
