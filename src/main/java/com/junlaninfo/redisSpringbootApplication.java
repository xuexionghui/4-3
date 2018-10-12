package com.junlaninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class redisSpringbootApplication {

	public static void main(String[] args) {
	SpringApplication application = new  SpringApplication(redisSpringbootApplication.class);
	application.run(args);
	}
}
