package com.ecommerce.sportsshoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SportsShoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsShoesApplication.class, args);
	}

}
