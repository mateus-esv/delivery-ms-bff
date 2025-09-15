package com.delivery.delivery_ms_bff.api.dtos.payment.paymentRequest;

import lombok.Builder;

@Builder
public record IdentificationDTO(String type, String number) { 
}
