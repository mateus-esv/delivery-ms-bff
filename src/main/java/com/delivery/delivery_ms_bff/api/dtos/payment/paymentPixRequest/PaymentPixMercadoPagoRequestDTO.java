package com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixRequest;

import java.math.BigDecimal;

import com.delivery.delivery_ms_bff.api.dtos.payment.payer.PayerDTO;

import lombok.Builder;

@Builder
public record PaymentPixMercadoPagoRequestDTO(BigDecimal transaction_amount, String description, String payment_method_id, PayerDTO payer){    
}
