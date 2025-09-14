package com.delivery.delivery_ms_bff.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.delivery_ms_bff.api.dtos.customer.CustomerInputDTO;
import com.delivery.delivery_ms_bff.domain.services.BffCustomerService;

@RestController
@RequestMapping(path = "/delivery/customer")
public class BffCustomerController {

    @Autowired
    private BffCustomerService service;
    
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody CustomerInputDTO customerInputDTO){
        return service.save(customerInputDTO);
    }


}
