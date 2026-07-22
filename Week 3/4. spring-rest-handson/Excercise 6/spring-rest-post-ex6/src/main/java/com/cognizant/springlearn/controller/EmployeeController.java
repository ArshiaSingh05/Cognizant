package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {

        LOGGER.info("START");
        LOGGER.info("Updating Employee : {}", employee.getId());

        // Simulating update
        employee.setSalary(employee.getSalary() + 5000);

        LOGGER.info("END");

        return employee;
    }
}