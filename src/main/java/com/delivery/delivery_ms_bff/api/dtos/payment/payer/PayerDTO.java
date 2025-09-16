package com.delivery.delivery_ms_bff.api.dtos.payment.payer;

import lombok.Builder;

@Builder
public record PayerDTO(String first_name, String last_name, String email, PhoneDTO phone, IdentificationDTO identification, AddressDTO address) {}
