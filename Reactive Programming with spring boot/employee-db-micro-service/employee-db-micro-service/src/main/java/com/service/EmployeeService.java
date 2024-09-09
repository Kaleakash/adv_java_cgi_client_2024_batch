package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.model.Department;

import reactor.core.publisher.Mono;

@Service
public class EmployeeService {

	@Autowired
	WebClient.Builder webClient;
	
	
	public  Mono<Department>  findDepartmentInfo(int did) {
		return webClient.build().get().uri("http://DEPARTMENT-MICRO-SERVICE/department/findbyid/"+did).retrieve().
				bodyToMono(Department.class);
	}
}
