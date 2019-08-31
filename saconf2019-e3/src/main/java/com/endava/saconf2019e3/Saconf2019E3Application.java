package com.endava.saconf2019e3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Saconf2019E3Application {

	@Value("${my.secret.name}")
	private String mySecretName;

	public static void main(String[] args) {
		SpringApplication.run(Saconf2019E3Application.class, args);
	}

	@GetMapping
	public String getMySecretName() {
		return "My secret name is: " + mySecretName;
	}
}
