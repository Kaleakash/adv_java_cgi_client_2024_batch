package com.employeeobjects;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDesializer implements Deserializer<Employee>{

	@Override
	public Employee deserialize(String topic, byte[] data) {
		// TODO Auto-generated method stub
		Employee emp=null;
		try {
			System.out.println(data);
			ObjectMapper mapper = new ObjectMapper();
			emp = mapper.readValue(data, Employee.class);			// convert byte format data into Employee 
			System.out.println(emp);
		} catch (Exception e) {
		}
		return emp;
	}
}
