package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.entities")
@ComponentScan("com.example.controller")
public class SpringDataOneToManyMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataOneToManyMappingApplication.class, args);
	}

}
