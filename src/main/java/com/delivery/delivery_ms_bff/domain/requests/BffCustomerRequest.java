package com.delivery.delivery_ms_bff.domain.requests;

import com.delivery.delivery_ms_bff.api.dtos.customers.CustomerInputDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "bff-customer-request", url = "${url.delivery.ms.customer}")
public interface BffCustomerRequest {

    @PostMapping("/customer/save")
    public ResponseEntity<?> save(CustomerInputDTO customerInputDTO);

    // @PutMapping("/user/update")
    // public ResponseEntity<?> update(UserUpdateInputDTO userUpdateInputDTO);

    // @GetMapping("/user/list")
    // public ResponseEntity<?> list(UserIDDTO userIDDTO);

    // @GetMapping("/user/list-all")
    // public ResponseEntity<?> listAll();

}
