package com.userobject;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializer implements Serializer<Employee>{

	// this method convert our object in byte format. 
	@Override
	public byte[] serialize(String topic, Employee data) {
		byte[] empData=null;
		try {
			System.out.println(data);
			ObjectMapper mapper=new ObjectMapper(); // help to convert our object in byte format.
			empData=mapper.writeValueAsString(data).getBytes();
			System.out.println(empData);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return empData;
	}
}
