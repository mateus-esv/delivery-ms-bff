package com.delivery.delivery_ms_bff.api.dtos.payment.payer;

import lombok.Builder;

@Builder
public record AddressDTO(
        String zip_code,
        String street_name,
        String street_number,
        String neighborhood,
        String city,
        String federal_unit
) {}
