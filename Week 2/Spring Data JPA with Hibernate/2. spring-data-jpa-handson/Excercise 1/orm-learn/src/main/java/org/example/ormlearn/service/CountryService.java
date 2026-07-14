package org.example.ormlearn.service;

import org.example.ormlearn.model.Country;
import org.example.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> searchCountries(String text) {

        return countryRepository.findByNameContaining(text);

    }

}