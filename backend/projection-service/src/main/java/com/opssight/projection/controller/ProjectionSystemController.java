package com.opssight.projection.controller;

import com.opssight.projection.dto.ProjectionPingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/v1/projections/system")
public class ProjectionSystemController {

    @GetMapping("/ping")
    public ProjectionPingResponse ping() {
        return new ProjectionPingResponse(
                "projection-service",
                "UP",
                Instant.now()
        );
    }
}
