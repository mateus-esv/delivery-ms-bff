package com.delivery.delivery_ms_bff.domain.requests;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.delivery.delivery_ms_bff.api.dtos.payment.paymentRequest.PaymentCreditCardMSRequestDTO;

@FeignClient(name = "bff-payment-request", url = "${url.delivery.ms.payment}")
public interface BffPaymentRequest {

    @PostMapping("/payment/credit-card")
    public ResponseEntity<?> creditCard(PaymentCreditCardMSRequestDTO paymentCreditCardMSRequestDTO);

}
