package com.cognizant.springlearn.service;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public Country getCountry(String code)
            throws CountryNotFoundException {

        if ("IN".equalsIgnoreCase(code)) {
            return new Country("IN", "India");
        }

        throw new CountryNotFoundException("Country not found");
    }
}