package com.delivery.delivery_ms_bff.domain.services;

import com.delivery.delivery_ms_bff.api.dtos.customer.CustomerIDDTO;
import com.delivery.delivery_ms_bff.api.dtos.customer.CustomerInputDTO;
import com.delivery.delivery_ms_bff.api.dtos.customer.CustomerUpdateInputDTO;
import com.delivery.delivery_ms_bff.domain.requests.BffCustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BffCustomerService {

    @Autowired
    private BffCustomerRequest request;

    public ResponseEntity<?> save(CustomerInputDTO customerInputDTO){
        return request.save(customerInputDTO);
    }

    public ResponseEntity<?> update(CustomerUpdateInputDTO customerUpdateInputDTO){
        return request.update(customerUpdateInputDTO);
    }

    public ResponseEntity<?> list(CustomerIDDTO customerIDDTO){
        return request.list(customerIDDTO);
    }

    public ResponseEntity<?> listAll(){
        return request.listAll();
    }

}
