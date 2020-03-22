package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// This class defines the Spring Security configuration for your application: 
// allowing all requests on the home path and requiring authentication for all other routes. 
// it also sets up the Spring Boot OAuth login flow.
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**").authorizeRequests()
            .antMatchers("/", "/login**").permitAll()
            .anyRequest().authenticated()
            .and()
            .oauth2Login();
    }
    
	
	/*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
        .antMatcher("/**")
        .authorizeRequests()
          .antMatchers("/", "/login", "/oauth/authorize", "/login**","/callback/", "/webjars/**", "/error**")
          .permitAll()
        .anyRequest()
          .authenticated();
    }
    */
}
