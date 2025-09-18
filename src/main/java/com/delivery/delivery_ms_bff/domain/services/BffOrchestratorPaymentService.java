package com.delivery.delivery_ms_bff.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.delivery_ms_bff.api.dtos.payment.paymentCreditCardRequest.PaymentCreditCardRequestDTO;
import com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixRequest.PaymentPixRequestDTO;
import com.delivery.delivery_ms_bff.domain.requests.BffOrchestratorPaymentRequest;

@Service
public class BffOrchestratorPaymentService {
    
    @Autowired
    private BffOrchestratorPaymentRequest request;

    public void creditCard(PaymentCreditCardRequestDTO paymentCreditCardRequestDTO){
        request.creditCard(paymentCreditCardRequestDTO);
    }
    public void generatePixCode(PaymentPixRequestDTO paymentPixRequestDTO){
        request.generatePixCode(paymentPixRequestDTO);
    }

}
