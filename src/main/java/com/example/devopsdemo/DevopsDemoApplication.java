package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDemoApplication {

	@GetMapping("/home")
	public String ar () {
		return "This Is Home Page for Nagarro Assignment Docker And K8S";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
