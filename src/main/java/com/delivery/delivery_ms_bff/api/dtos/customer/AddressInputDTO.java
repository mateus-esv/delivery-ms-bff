package com.delivery.delivery_ms_bff.api.dtos.customer;

import lombok.Builder;

@Builder
public record AddressInputDTO(String state, String city, String neighborhood, String road, String number, String complement) { }
