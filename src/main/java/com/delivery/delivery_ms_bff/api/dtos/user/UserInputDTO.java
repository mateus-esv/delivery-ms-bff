package com.delivery.delivery_ms_bff.api.dtos.user;

import lombok.*;

@Builder
public record UserInputDTO(String fullName, String email, String phone, UserEnum level) {
}
