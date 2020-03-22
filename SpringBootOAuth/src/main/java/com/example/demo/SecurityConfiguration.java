package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// The SecurityConfiguration class is the class that actually authenticates requests to your authorization server. Notice near the top where it’s pulling in the username and password from the application.properties file.
@Configuration
@Order(1)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Value("${user.oauth.user.username}")
    private String username;
    @Value("${user.oauth.user.password}")
    private String password;

    /*
     *  http
          .antMatcher("/**")
          .authorizeRequests()
            .antMatchers("/", "/login**","/callback/", "/webjars/**", "/error**")
            .permitAll()
          .anyRequest()
            .authenticated();
     */
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

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser(username)
            .password(passwordEncoder().encode(password))
            .roles("USER");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

