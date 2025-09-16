package com.delivery.delivery_ms_bff.domain.requests;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.delivery.delivery_ms_bff.api.dtos.payment.paymentCreditCardRequest.PaymentCreditCardRequestDTO;
import com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixRequest.PaymentPixRequestDTO;


@FeignClient(name = "bff-payment-request", url = "${url.delivery.ms.payment}")
public interface BffPaymentRequest {

    @PostMapping("/payment/credit-card")
    public ResponseEntity<?> creditCard(PaymentCreditCardRequestDTO paymentCreditCardRequestDTO);

    @PostMapping("/payment/generate-pix-code")
    public ResponseEntity<?> generatePixCode(PaymentPixRequestDTO paymentPixRequestDTO);

}
