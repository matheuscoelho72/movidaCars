package com.example.movidaCars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MovidaCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovidaCarsApplication.class, args);
	}
	
}
