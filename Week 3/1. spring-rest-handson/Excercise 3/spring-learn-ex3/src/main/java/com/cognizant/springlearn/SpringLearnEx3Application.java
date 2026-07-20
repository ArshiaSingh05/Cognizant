package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnEx3Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnEx3Application.class, args);

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("date-format.xml");

		DateFormatter formatter =
				context.getBean("dateFormatter", DateFormatter.class);

		formatter.displayDate();

		context.close();

	}

}