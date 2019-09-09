package com.asset.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BootTestProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootTestProject2Application.class, args);
	}

}
