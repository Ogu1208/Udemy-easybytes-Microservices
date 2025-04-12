package com.easybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "Ogu's Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Ogu1208",
                        email = "ogu@gmail.com",
                        url = "https://www.easybytes.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.easybytes.com"
                )
        ),
        externalDocs = @ExternalDocumentation( // 추가적인 외부 참고 Doc
                description = "EasyBank Accounts microservice REST API Documentation",
                url = "https://www.easybytes.com/swagger-ui.html"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }
}
