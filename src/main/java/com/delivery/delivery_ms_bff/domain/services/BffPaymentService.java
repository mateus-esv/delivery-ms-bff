package com.delivery.delivery_ms_bff.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.delivery.delivery_ms_bff.api.dtos.payment.paymentCreditCardRequest.PaymentCreditCardRequestDTO;
import com.delivery.delivery_ms_bff.api.dtos.payment.paymentPixRequest.PaymentPixRequestDTO;
import com.delivery.delivery_ms_bff.domain.requests.BffPaymentRequest;

@Service
public class BffPaymentService {
    
    @Autowired
    private BffPaymentRequest request;

    public ResponseEntity<?> creditCard(PaymentCreditCardRequestDTO paymentCreditCardRequestDTO){
        return request.creditCard(paymentCreditCardRequestDTO);
    }
    public ResponseEntity<?> generatePixCode(PaymentPixRequestDTO paymentPixRequestDTO){
        return request.generatePixCode(paymentPixRequestDTO);
    }

}
