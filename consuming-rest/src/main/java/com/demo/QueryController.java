package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QueryController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/rest")
	public String getResult() {
		return "Hello World";
	}
	
	@GetMapping("/quote")
	public Quote getQuote() {
		Quote quote = restTemplate.getForObject(
				"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		return quote;
	}
}
