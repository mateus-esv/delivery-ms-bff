package com.delivery.delivery_ms_bff.api.dtos.user;

import lombok.*;
import java.util.UUID;

@Builder
public record UserUpdateInputDTO(UUID id, String fullName, String email, String phone, UserEnum level) {
}
