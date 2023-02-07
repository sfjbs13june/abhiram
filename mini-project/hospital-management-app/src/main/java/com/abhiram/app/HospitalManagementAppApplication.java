package com.abhiram.app;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/",description = "Hospital Server URL")})
@SpringBootApplication
public class HospitalManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementAppApplication.class, args);
	}

}
