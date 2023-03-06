package com.example.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootConfiguration
public class CurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdApplication.class, args);
		System.out.println("done");
	}

}
