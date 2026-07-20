package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class SpringLearnEx6Application {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringLearnEx6Application.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnEx6Application.class, args);

		displayCountries();

	}

	public static void displayCountries() {

		LOGGER.info("START");

		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");

		ArrayList<Country> countryList =
				context.getBean("countryList", ArrayList.class);

		LOGGER.debug("Countries : {}", countryList);

		LOGGER.info("END");

		((ClassPathXmlApplicationContext) context).close();

	}

}