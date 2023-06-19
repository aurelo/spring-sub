package com.kanezi.gitlab_cicd_deep_dive.library_pub_sub.spring_sub;

import com.kanezi.gitlab_cicd_deep_dive.library_pub_sub.UuidTimestampGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
public class SpringConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumerApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class TimestampUUIDController {

	@GetMapping
	String rand() {
		return UuidTimestampGenerator.generate();
	}

}