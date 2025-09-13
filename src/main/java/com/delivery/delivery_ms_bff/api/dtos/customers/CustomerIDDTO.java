package com.delivery.delivery_ms_bff.api.dtos.customers;

import lombok.Builder;
import java.util.UUID;

@Builder
public record CustomerIDDTO(UUID id){
}