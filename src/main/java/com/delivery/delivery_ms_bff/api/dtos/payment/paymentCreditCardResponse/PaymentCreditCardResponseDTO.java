package com.delivery.delivery_ms_bff.api.dtos.payment.paymentCreditCardResponse;

import lombok.Builder;

@Builder
public record PaymentCreditCardResponseDTO(
        Long id,
        String status,
        String status_detail) {
}