package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnEx4Application {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringLearnEx4Application.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnEx4Application.class, args);

		displayCountry();

	}

	public static void displayCountry() {

		LOGGER.info("START");

		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");

		Country country =
				context.getBean("country", Country.class);

		LOGGER.debug("Country : {}", country);

		LOGGER.info("END");

		((ClassPathXmlApplicationContext) context).close();

	}

}