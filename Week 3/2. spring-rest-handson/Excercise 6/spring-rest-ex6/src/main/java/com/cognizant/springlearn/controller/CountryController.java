package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    public CountryController() {
        LOGGER.debug("CountryController Constructor");
    }

    @GetMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START");

        Country country = new Country("IN","India");

        LOGGER.info("END");

        return country;

    }

}