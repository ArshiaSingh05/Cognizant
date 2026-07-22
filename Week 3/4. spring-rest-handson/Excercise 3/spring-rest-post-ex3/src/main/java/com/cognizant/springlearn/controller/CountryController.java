package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @PostMapping("/countries")
    public Country addCountry(@Valid @RequestBody Country country) {

        LOGGER.info("Start");

        LOGGER.info("Country : {}", country);

        return country;

    }

}