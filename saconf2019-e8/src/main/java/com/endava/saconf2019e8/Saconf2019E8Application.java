package com.endava.saconf2019e8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class Saconf2019E8Application {

	Logger logger = LoggerFactory.getLogger(Saconf2019E8Application.class);

	@GetMapping("/test")
	public String stress() {
		for (int i=0 ;i<100000; i++) {
			double x = Math.random() * i;
			logger.info("Iteration {} at {}" ,i , LocalDateTime.now());
		}
		return "ok";
	}

	public static void main(String[] args) {
		SpringApplication.run(Saconf2019E8Application.class, args);
	}

}

