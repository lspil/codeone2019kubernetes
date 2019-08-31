package com.endava.saconf2019e72;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Saconf2019E72Application {

	@GetMapping("/container2")
	public String container2() {
		return "From container 2";
	}

	public static void main(String[] args) {
		SpringApplication.run(Saconf2019E72Application.class, args);
	}

}

