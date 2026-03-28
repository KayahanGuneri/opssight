package com.opssight.caseapp.dto;

import java.time.Instant;

public record CasePingResponse(
        String service,
        String status,
        Instant timestamp
) {
}
