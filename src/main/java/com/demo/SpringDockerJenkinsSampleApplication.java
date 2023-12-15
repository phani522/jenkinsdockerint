package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDockerJenkinsSampleApplication {

	public static void main(String[] args) {
		
		System.out.println("Jenkins integrated with Git, docker");
		SpringApplication.run(SpringDockerJenkinsSampleApplication.class, args);
	}

}
