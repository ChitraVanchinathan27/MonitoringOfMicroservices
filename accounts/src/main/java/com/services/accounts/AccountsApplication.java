package com.services.accounts;

import com.services.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
/*@ComponentScans({ @ComponentScan("com.services.accounts.controller") })
@EnableJpaRepositories("com.services.accounts.repository")
@EntityScan("com.services.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Test Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Chitra",
						email = "tutor@services.com",
						url = "https://www.services.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.services.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Test Accounts microservice REST API Documentation",
				url = "https://www.services.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
