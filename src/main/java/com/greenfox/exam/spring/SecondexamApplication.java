package com.greenfox.exam.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class SecondexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondexamApplication.class, args);
	}
}
