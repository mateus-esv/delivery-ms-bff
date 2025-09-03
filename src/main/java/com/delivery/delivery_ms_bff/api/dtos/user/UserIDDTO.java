package com.delivery.delivery_ms_bff.api.dtos.user;

import lombok.Builder;
import java.util.UUID;

@Builder
public record UserIDDTO(UUID id) {
}
