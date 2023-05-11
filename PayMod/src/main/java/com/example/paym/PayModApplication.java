package com.example.paym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class } )

public class PayModApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayModApplication.class, args);
		
		System.out.println("App Launched");
	}

}
