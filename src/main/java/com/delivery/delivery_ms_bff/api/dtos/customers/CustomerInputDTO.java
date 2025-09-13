package com.delivery.delivery_ms_bff.api.dtos.customers;

import lombok.*;

@Builder
public record CustomerInputDTO(String fullName, String cpf, String email, String phone, AddressInputDTO addressInputDTO){
}



