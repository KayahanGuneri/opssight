package com.opssight.gateway.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI gatewayOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("OpsSight Gateway Service API")
                        .description("Entry and system-facing API for OpsSight gateway-service")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("OpsSight project documentation"));
    }
}
