package com.delivery.delivery_ms_bff.domain.requests;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.delivery.delivery_ms_bff.api.dtos.payment.paymentCreditCardRequest.PaymentCreditCardRequestDTO;
import com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixRequest.PaymentPixRequestDTO;


@FeignClient(name = "bff-payment-request", url = "${url.delivery.ms.orchestrator-payment}")
public interface BffOrchestratorPaymentRequest {

    @PostMapping("/orchestrator-payment/credit-card")
    public void creditCard(PaymentCreditCardRequestDTO paymentCreditCardRequestDTO);

    @PostMapping("/orchestrator-payment/generate-pix-code")
    public void generatePixCode(PaymentPixRequestDTO paymentPixRequestDTO);

}
