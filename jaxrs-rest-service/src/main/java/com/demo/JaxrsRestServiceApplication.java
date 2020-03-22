package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JaxrsRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxrsRestServiceApplication.class, args);
	}

	 @Bean
	    protected StormtrooperDao stormtrooperDao() {
	        return new DefaultStormtrooperDao();
	    }
}
