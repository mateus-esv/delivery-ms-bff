package com.delivery.delivery_ms_bff.domain.requests;

import com.delivery.delivery_ms_bff.api.dtos.user.UserIDDTO;
import com.delivery.delivery_ms_bff.api.dtos.user.UserInputDTO;
import com.delivery.delivery_ms_bff.api.dtos.user.UserUpdateInputDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "bff-user-request", url = "${url.delivery.ms.user}")
public interface BffUserRequest {

    @PostMapping("/user/save")
    public ResponseEntity<?> save(UserInputDTO userInputDTO);

    @PutMapping("/user/update")
    public ResponseEntity<?> update(UserUpdateInputDTO userUpdateInputDTO);

    @GetMapping("/user/list")
    public ResponseEntity<?> list(UserIDDTO userIDDTO);

    @GetMapping("/user/list-all")
    public ResponseEntity<?> listAll();

}
