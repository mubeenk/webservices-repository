package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.service.DefaultStormtrooperDao;
import com.demo.service.StormtrooperDao;

@SpringBootApplication
//@ComponentScan({"demo"})
public class SampleRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestServiceApplication.class, args);
	}

	@Bean
    protected StormtrooperDao stormtrooperDao() {
        return new DefaultStormtrooperDao();
    }

}

