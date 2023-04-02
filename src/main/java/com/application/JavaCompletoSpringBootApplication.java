package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.entities")
@SpringBootApplication
public class JavaCompletoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCompletoSpringBootApplication.class, args);
	}

}
