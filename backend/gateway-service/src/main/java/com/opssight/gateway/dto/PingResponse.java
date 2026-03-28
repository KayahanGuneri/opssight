package com.opssight.gateway.dto;

import java.time.Instant;

public record PingResponse(
        String service,
        String status,
        Instant timestamp
) {
}
