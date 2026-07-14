package com.library;

import com.library.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(LibraryManagementApplication.class);
		BookController bookController=context.getBean(BookController.class);
		bookController.getBooks();
	}
}