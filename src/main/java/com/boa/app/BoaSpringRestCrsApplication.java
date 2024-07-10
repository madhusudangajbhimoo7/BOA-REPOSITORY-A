package com.boa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableJpaRepositories("com.boa.app.repo")
@EntityScan("com.boa.app.entity")
@EnableWebMvc
@ComponentScan({"com.boa.app.*"})
@SpringBootApplication
public class BoaSpringRestCrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaSpringRestCrsApplication.class, args);
	}

}
