package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        String name = "Arshu";
        int age = 25;

        logger.info("User name: {}, Age: {}", name, age);
    }
}