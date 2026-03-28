package com.opssight.caseapp.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI caseServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("OpsSight Case Service API")
                        .description("Command-side case domain API for OpsSight")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("OpsSight project documentation"));
    }
}
