package com.delivery.delivery_ms_bff.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.delivery_ms_bff.api.dtos.payment.paymentRequest.PaymentCreditCardMSRequestDTO;
import com.delivery.delivery_ms_bff.domain.services.BffPaymentService;

@RestController
@RequestMapping(path = "/delivery/payment")
public class BffPaymentController {
    
    @Autowired
    private BffPaymentService service;

    @PostMapping("/credit-card")
    public ResponseEntity<?> creditCard(@RequestBody PaymentCreditCardMSRequestDTO paymentCreditCardMSRequestDTO){
        return service.creditCard(paymentCreditCardMSRequestDTO);
    }

}
