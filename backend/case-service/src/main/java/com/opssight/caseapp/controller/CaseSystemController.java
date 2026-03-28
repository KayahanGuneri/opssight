package com.opssight.caseapp.controller;

import com.opssight.caseapp.dto.CasePingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/v1/cases/system")
public class CaseSystemController {

    @GetMapping("/ping")
    public CasePingResponse ping() {
        return new CasePingResponse(
                "case-service",
                "UP",
                Instant.now()
        );
    }
}
