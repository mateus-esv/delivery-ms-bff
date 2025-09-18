package com.delivery.delivery_ms_bff.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.delivery_ms_bff.api.dtos.payment.paymentCreditCardRequest.PaymentCreditCardRequestDTO;
import com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixRequest.PaymentPixRequestDTO;
import com.delivery.delivery_ms_bff.domain.services.BffOrchestratorPaymentService;

@RestController
@RequestMapping(path = "/delivery/payment")
public class BffPaymentController {

    @Autowired
    private BffOrchestratorPaymentService service;

    @PostMapping("/credit-card")
    public void creditCard(@RequestBody PaymentCreditCardRequestDTO paymentCreditCardMSRequestDTO) {
        service.creditCard(paymentCreditCardMSRequestDTO);
    }

    @PostMapping("/generate-pix-code")
    public void generatePixCode(@RequestBody PaymentPixRequestDTO paymentPixRequestDTO) {
        service.generatePixCode(paymentPixRequestDTO);
    }

}
