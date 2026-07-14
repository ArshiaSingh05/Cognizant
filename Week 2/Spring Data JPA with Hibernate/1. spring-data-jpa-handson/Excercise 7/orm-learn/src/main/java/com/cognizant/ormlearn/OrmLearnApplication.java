package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) {

		testAddCountry();

	}

	private void testAddCountry() {

		System.out.println("Start");

		Country country = new Country("JP", "Japan");

		countryService.addCountry(country);

		System.out.println("Country Added Successfully");

		System.out.println("End");

	}
}