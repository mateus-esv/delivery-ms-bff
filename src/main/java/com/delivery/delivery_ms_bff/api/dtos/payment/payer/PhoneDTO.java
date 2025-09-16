package com.delivery.delivery_ms_bff.api.dtos.payment.payer;

import lombok.Builder;

@Builder
public record PhoneDTO(String area_code, String number) {
}
