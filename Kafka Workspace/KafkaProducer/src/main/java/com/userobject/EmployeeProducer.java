package com.userobject;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class EmployeeProducer {
	public static void main(String[] args) {
		String topicName ="employee_topic";
		
		Properties pp = new Properties();
		
		pp.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");		// link to Apache broker server 
		pp.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());		// key type of string 
		pp.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, EmployeeSerializer.class.getName());		// value type is Employee 		
		
		Employee emp1 = new Employee("Raj", 26);
		
		Producer<String, Employee> producerRef = new KafkaProducer<String,Employee>(pp);	// kakfa producer ref ready to send the data 

		ProducerRecord<String, Employee> data = new ProducerRecord<String, Employee>(topicName, emp1);
		
		producerRef.send(data);
		
		producerRef.close();
		System.out.println("Send Messasge successfully using java to apache kafka");
	}
}
