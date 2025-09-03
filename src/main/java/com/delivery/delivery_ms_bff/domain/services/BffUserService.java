package com.delivery.delivery_ms_bff.domain.services;

import com.delivery.delivery_ms_bff.api.dtos.user.UserInputDTO;
import com.delivery.delivery_ms_bff.domain.requests.BffUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BffUserService {

    @Autowired
    private BffUserRequest request;

    public ResponseEntity<?> save(UserInputDTO userInputDTO){
        return request.save(userInputDTO);
    }

}
