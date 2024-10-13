package com.chandra.myJournlismProject.controller;

import com.chandra.myJournlismProject.service.HealthCheckService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health-check")
    public String healthCheck() {
        return "OK";
    }
}




