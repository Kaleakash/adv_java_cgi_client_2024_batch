package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.entity.Login;
import com.repository.LoginRepository;

@Service
public class LoginService implements UserDetailsService{

	// find user details from database with role 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Autowired
	LoginRepository loginRepository;
	
	public String signUp(Login login) {
		Optional<Login> result = loginRepository.findById(login.getUsername());
		if(result.isPresent()) {
			return "Account already present";
		}else {
			loginRepository.save(login);
			return "Account created successfully";
		}
	}
}
