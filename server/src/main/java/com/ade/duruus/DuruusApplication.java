package com.ade.duruus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DuruusApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuruusApplication.class, args);
	}

	@GetMapping("/root")
	public String apiRoot() {
		return "Welcome to Spring";
	}

}
