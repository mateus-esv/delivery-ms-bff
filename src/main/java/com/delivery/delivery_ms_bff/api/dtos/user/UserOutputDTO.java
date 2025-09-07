package com.delivery.delivery_ms_bff.api.dtos.user;

import java.util.UUID;

import lombok.Builder;

@Builder
public record UserOutputDTO(UUID id, String fullName, String email, String phone, UserEnum level) {


}
