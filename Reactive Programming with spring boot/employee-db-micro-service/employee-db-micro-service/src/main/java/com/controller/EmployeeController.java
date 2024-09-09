package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;
import com.service.EmployeeService;

import reactor.core.publisher.Mono;

@RequestMapping("employees")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@GetMapping(value = "finddepartment/{did}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Department> findDepartment(@PathVariable("did") int did){
		return employeeService.findDepartmentInfo(did);
	}
}
