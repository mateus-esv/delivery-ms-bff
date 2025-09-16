package com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixRequest;

import java.math.BigDecimal;
import java.util.UUID;

import com.delivery.delivery_ms_bff.api.dtos.payment.payer.PayerDTO;

import lombok.Builder;

@Builder
public record PaymentPixRequestDTO(UUID idCustomer, BigDecimal transaction_amount, String description, String payment_method_id, PayerDTO payer){    
}
