package com.takima.backskeleton;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackSkeletonApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackSkeletonApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("#### Application working ####");
	}

}
