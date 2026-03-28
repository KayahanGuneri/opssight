package com.opssight.aiinsight.dto;

import java.time.Instant;

public record AiInsightPingResponse(
        String service,
        String status,
        Instant timestamp
) {
}
