package com.splitit.splitit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan(basePackages="com.splitit.Controllers")
@Configuration
@EnableJpaRepositories("com.splitit.Repository")
@EntityScan(basePackages="com.splitit.Models")
public class DemoApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/**
	@RestController
	public class HelloController {

		@RequestMapping("/")
		public String index() {
			return "Greetings from Spring Boot!";
		}

	}**/

}