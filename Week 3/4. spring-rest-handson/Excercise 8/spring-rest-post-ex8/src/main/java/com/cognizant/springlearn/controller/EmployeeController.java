package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        LOGGER.info("START");
        LOGGER.info("Deleting Employee with ID : {}", id);

        LOGGER.info("END");

        return "Employee with ID " + id + " deleted successfully.";

    }

}