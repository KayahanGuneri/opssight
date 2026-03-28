package com.opssight.aiinsight.controller;

import com.opssight.aiinsight.dto.AiInsightPingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/v1/insights/system")
public class AiInsightSystemController {

    @GetMapping("/ping")
    public AiInsightPingResponse ping() {
        return new AiInsightPingResponse(
                "ai-insight-service",
                "UP",
                Instant.now()
        );
    }
}
