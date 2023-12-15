package com.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringDockerJenkinsSampleApplication {

	public static void main(String[] args) {
	    
		SpringApplication.run(SpringDockerJenkinsSampleApplication.class, args);
		System.out.println("Jenkins integrated with Git, docker");
		
	}

}
