package com.delivery.delivery_ms_bff.api.dtos.user;

import lombok.*;
import java.util.UUID;

@Builder
public record UserUpdateInputDTO(UUID id, String fullname, String email, String password, String phone, UserEnum level) {
}
