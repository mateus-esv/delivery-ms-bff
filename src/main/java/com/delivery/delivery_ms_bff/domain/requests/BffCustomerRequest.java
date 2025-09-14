package com.delivery.delivery_ms_bff.domain.requests;

import com.delivery.delivery_ms_bff.api.dtos.customer.CustomerIDDTO;
import com.delivery.delivery_ms_bff.api.dtos.customer.CustomerInputDTO;
import com.delivery.delivery_ms_bff.api.dtos.customer.CustomerUpdateInputDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "bff-customer-request", url = "${url.delivery.ms.customer}")
public interface BffCustomerRequest {

    @PostMapping("/customer/save")
    public ResponseEntity<?> save(CustomerInputDTO customerInputDTO);

    @PutMapping("/customer/update")
    public ResponseEntity<?> update(CustomerUpdateInputDTO customerUpdateInputDTO);

    @GetMapping("/customer/list")
    public ResponseEntity<?> list(CustomerIDDTO customerIDDTO);

    @GetMapping("/customer/list-all")
    public ResponseEntity<?> listAll();

}
