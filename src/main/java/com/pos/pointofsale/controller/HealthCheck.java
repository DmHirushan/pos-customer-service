package com.pos.pointofsale.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/")
    public String healthCheck(){
        return "Spring boot API is up and running...";
    }
}
