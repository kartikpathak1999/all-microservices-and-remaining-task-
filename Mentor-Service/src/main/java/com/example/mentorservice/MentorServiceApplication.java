package com.example.mentorservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Mentor-Service API Documentation",
				description = "Mentor-Service REST API Documentation Demo",
				version = "v1.0",
				contact = @Contact(
						name = "Darshan",
						email = "imdarshan23@gmail.com"
				),
				license = @License(
						name = "Apache 2.0"

				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring boot Mentor-Service Management Documentation ",
				url = "https://github.com/darshanD23/Day-2_Spring-Boot"
		)
)
public class MentorServiceApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(MentorServiceApplication.class, args);
	}

}
