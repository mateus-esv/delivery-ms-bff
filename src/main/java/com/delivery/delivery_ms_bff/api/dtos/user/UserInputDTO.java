package com.delivery.delivery_ms_bff.api.dtos.user;

import lombok.*;

@Builder
public record UserInputDTO(String fullname, String email, String password, String phone, UserEnum level) {
}
