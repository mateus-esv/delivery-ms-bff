package com.delivery.delivery_ms_bff.domain.services;

import com.delivery.delivery_ms_bff.api.dtos.user.UserIDDTO;
import com.delivery.delivery_ms_bff.api.dtos.user.UserInputDTO;
import com.delivery.delivery_ms_bff.api.dtos.user.UserUpdateInputDTO;
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

    public ResponseEntity<?> update(UserUpdateInputDTO userUpdateInputDTO){
        return request.update(userUpdateInputDTO);
    }

    public ResponseEntity<?> list(UserIDDTO userIDDTO){
        return request.list(userIDDTO);
    }

    public ResponseEntity<?> listAll(){
        return request.listAll();
    }

}
