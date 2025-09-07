package com.delivery.delivery_ms_bff.api.controllers;

import com.delivery.delivery_ms_bff.api.dtos.user.UserIDDTO;
import com.delivery.delivery_ms_bff.api.dtos.user.UserInputDTO;
import com.delivery.delivery_ms_bff.api.dtos.user.UserUpdateInputDTO;
import com.delivery.delivery_ms_bff.domain.services.BffUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/delivery/user")
public class BffUserController {

    @Autowired
    private BffUserService service;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserInputDTO userInputDTO){
        return service.save(userInputDTO);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody UserUpdateInputDTO userUpdateInputDTO){
        return service.update(userUpdateInputDTO);
    }

    @GetMapping("/list")
    public ResponseEntity<?> list(@RequestBody UserIDDTO userIDDTO){
        return service.list(userIDDTO);
    }

    @GetMapping("/list-all")
    public ResponseEntity<?> listAll(){
        return service.listAll();
    }

}
