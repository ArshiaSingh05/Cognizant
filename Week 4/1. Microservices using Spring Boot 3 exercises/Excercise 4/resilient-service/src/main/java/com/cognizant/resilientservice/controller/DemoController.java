package com.cognizant.resilientservice.controller;

import com.cognizant.resilientservice.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping("/demo")
    public String demo() {
        return service.getData();
    }
}