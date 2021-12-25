package com.github.lastsunday.cloud.restfulsample.restfulsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
public class RestfulsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulsampleApplication.class, args);
	}

}
