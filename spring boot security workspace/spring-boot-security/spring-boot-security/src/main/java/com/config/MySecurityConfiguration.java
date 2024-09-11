package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration					// like xml file 
@EnableWebSecurity
public class MySecurityConfiguration {

	@Bean
	public UserDetailsService userDetailsService() {
		List<UserDetails> listOfUser = new ArrayList<UserDetails>();
		listOfUser.add(User.withDefaultPasswordEncoder().username("akash").password("123456").roles("USER_ROLE").build());
		listOfUser.add(User.withDefaultPasswordEncoder().username("vikash").password("2468").roles("USER_ROLE").build());
		listOfUser.add(User.withDefaultPasswordEncoder().username("prakash").password("1357").build());
		return new InMemoryUserDetailsManager(listOfUser);
	}
}
