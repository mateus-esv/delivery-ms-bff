package com.delivery.delivery_ms_bff.api.dtos.customer;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CustomerOutputDTO(UUID id, String fullName, String cpf, String email, String phone, AddressOutputDTO addressOutputDTO, PointsOutputDTO pointsOutputDTO){
}
