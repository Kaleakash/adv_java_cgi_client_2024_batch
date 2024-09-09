package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Department;
import com.repository.DepartmentRepository;

import reactor.core.publisher.Mono;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
//	public Optional<Department> findDeparmentById(int did) {
//		
//		
//		return null;
//	}
	
	public  void storeDepartment(Department department) {
	Mono<Department> result	= departmentRepository.findById(department.getDid());
	result.subscribe(ele-> {
		System.out.println(ele);
	});
	
	}
}
