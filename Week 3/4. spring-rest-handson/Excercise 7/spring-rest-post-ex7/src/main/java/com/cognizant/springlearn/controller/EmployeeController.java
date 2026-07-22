package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        return new Employee(id, "Rahul", 50000);

    }

}