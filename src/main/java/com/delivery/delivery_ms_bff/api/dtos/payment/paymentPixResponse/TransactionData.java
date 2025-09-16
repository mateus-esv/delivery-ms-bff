package com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixResponse;

import lombok.Builder;

@Builder
public record TransactionData(
        String qr_code,
        String qr_code_base64) {
}