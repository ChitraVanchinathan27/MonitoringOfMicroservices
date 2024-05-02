package com.services.loans;

import com.services.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.services.loans.controller") })
@EnableJpaRepositories("com.services.loans.repository")
@EntityScan("com.services.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "Test Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Chitra",
						email = "test@services.com",
						url = "https://www.services.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.services.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Test Loans microservice REST API Documentation",
				url = "https://www.services.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}