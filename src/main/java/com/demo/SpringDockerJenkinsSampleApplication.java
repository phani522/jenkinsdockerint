package com.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringDockerJenkinsSampleApplication {
	static Logger logger = (Logger) LoggerFactory.getLogger(SpringDockerJenkinsSampleApplication.class);

	public static void main(String[] args) {
	    
		try {
			logger.info("Logger used for output");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		SpringApplication.run(SpringDockerJenkinsSampleApplication.class, args);
		System.out.println("Jenkins integrated with Git, docker");
		
	}

}
