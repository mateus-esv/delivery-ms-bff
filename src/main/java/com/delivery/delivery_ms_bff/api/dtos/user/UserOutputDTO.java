package com.delivery.delivery_ms_bff.api.dtos.user;

import lombok.Builder;

@Builder
public record UserOutputDTO(String fullname, String email, String phone, UserEnum level) {


}
