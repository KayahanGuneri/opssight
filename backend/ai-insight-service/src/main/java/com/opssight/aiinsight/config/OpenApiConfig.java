package com.opssight.aiinsight.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI aiInsightOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("OpsSight AI Insight Service API")
                        .description("AI augmentation service API for OpsSight")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("OpsSight project documentation"));
    }
}
