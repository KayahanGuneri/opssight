package com.opssight.projection.dto;

import java.time.Instant;

public record ProjectionPingResponse(
        String service,
        String status,
        Instant timestamp
) {
}
