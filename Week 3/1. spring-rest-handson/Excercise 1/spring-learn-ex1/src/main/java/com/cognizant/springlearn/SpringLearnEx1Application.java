package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnEx1Application {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnEx1Application.class);

    public static void main(String[] args) {

        LOGGER.info("Application Started");

        SpringApplication.run(SpringLearnEx1Application.class, args);

        LOGGER.info("Application Finished Loading");
    }

}