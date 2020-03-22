package com.example.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This file allows the client apps to find out more about the users that authenticate with the server.
@RestController
public class UserController {
	
	  @GetMapping("/user/me")
	  public Principal user(Principal principal) {
	        return principal;
	    }
}
