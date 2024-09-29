package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Department Service Rest API",
				description = "Department Service Rest API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Vijay",
						email = "vijay@gmail.com",
						url = "https://dummy.com"

				),
				license = @License(
						name = "Apache 2.0",
						url = "https://dummy.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department Service Docs",
				url = "https://dummy.com"
		)
)
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
