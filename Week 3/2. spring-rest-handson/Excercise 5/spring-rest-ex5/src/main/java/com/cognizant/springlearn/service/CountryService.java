package com.cognizant.springlearn.service;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {

    public Country getCountry(String code)
            throws CountryNotFoundException {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        ArrayList<Country> countries =
                context.getBean("countryList", ArrayList.class);

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {

                ((ClassPathXmlApplicationContext) context).close();

                return country;

            }

        }

        ((ClassPathXmlApplicationContext) context).close();

        throw new CountryNotFoundException("Country not found");

    }

}