package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnEx2Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnEx2Application.class, args);

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("date-format.xml");

		SimpleDateFormat dateFormat =
				context.getBean("dateFormat", SimpleDateFormat.class);

		System.out.println("Current Date : "
				+ dateFormat.format(new Date()));

		context.close();

	}

}