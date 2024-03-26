package com.webFrom.WebForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.webFrom.WebForm")
public class WebFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFormApplication.class, args);
		System.out.println("sum spring");
	}

}
