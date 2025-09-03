package com.delivery.delivery_ms_bff.domain.requests;

import com.delivery.delivery_ms_bff.api.dtos.user.UserInputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "bff_user_request", url = "${url.delivery.ms.user}")
public interface BffUserRequest {

    @PostMapping("/user/save")
    public ResponseEntity<?> save(UserInputDTO userInputDTO);

}
