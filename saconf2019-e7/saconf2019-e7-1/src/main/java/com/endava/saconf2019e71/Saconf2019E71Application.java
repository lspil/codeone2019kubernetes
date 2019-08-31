package com.endava.saconf2019e71;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Saconf2019E71Application {

	@GetMapping("/container1")
	public String container1() {
		return "From container 1";
	}

	public static void main(String[] args) {
		SpringApplication.run(Saconf2019E71Application.class, args);
	}

}

