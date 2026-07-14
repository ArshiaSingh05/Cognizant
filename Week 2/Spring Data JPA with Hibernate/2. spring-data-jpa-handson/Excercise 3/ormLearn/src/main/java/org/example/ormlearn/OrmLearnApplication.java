package org.example.ormlearn;

import org.example.ormlearn.model.Country;
import org.example.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        testSearchCountries();

    }

    private void testSearchCountries() {

        System.out.println("Countries starting with 'A'");

        List<Country> countries =
                countryService.searchCountries("A");

        countries.forEach(System.out::println);

    }

}