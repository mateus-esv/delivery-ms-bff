package com.delivery.delivery_ms_bff.api.controllers;

import com.delivery.delivery_ms_bff.api.dtos.user.UserInputDTO;
import com.delivery.delivery_ms_bff.domain.services.BffUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/delivery/user")
public class BffUserController {

    private BffUserService service;

    @PostMapping("/save")
    public ResponseEntity<?> save(UserInputDTO userInputDTO){
        return service.save(userInputDTO);
    }

}
