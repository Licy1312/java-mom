package com.java.yage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: Lee
 */
@SpringBootApplication
@ImportResource("classpath:spring-application.xml")
public class JavaMomApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMomApplication.class, args);
	}
}
