package com.cognizant.resilientservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @CircuitBreaker(name = "demo", fallbackMethod = "fallback")
    public String getData() {

        throw new RuntimeException("Service Down");
    }

    public String fallback(Exception e) {

        return "Fallback Response : Service is temporarily unavailable.";
    }
}