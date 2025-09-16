package com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixResponse;

import lombok.Builder;

@Builder
public record PointOfInteraction(
        TransactionData transaction_data) {
}