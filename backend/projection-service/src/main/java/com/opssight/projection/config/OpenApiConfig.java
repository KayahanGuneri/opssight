package com.opssight.projection.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI projectionOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("OpsSight Projection Service API")
                        .description("Read-side projection API for OpsSight")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("OpsSight project documentation"));
    }
}
