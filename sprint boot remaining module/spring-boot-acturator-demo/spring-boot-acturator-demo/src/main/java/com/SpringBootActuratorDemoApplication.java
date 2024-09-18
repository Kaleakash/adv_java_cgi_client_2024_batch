package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuratorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuratorDemoApplication.class, args);
		System.out.println("spring boot actuator app up!");
	}

}
