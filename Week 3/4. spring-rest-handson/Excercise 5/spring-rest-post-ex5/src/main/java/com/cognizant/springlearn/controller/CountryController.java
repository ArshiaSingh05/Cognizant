package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @PostMapping("/countries")
    public Country addCountry(@Valid @RequestBody Country country) {

        return country;

    }

}