package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppApplication.class, args);
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello There";
	}
	@GetMapping("/sayBye")
	public String sayBye() {
		return "Goodbye, old friend";
	}
	@GetMapping("/sayThanks")
	public String sayThanks() {
		return "Preciate it my boy";
	}

}
