package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
		System.out.println("spring boot kafka consumer up on port number 8282");
	}

}
