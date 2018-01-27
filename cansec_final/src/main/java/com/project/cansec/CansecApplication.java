package com.project.cansec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
/*@Configuration
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})*/
public class CansecApplication {

	public static void main(String[] args) {
		SpringApplication.run(CansecApplication.class, args);
	}
}
