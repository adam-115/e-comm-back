package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.it"})
@EnableJpaRepositories
public class EcommBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommBackApplication.class, args);
	}

}
