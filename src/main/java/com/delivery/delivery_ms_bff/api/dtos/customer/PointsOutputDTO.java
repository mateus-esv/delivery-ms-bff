package com.delivery.delivery_ms_bff.api.dtos.customer;

import lombok.*;

@Builder
public record PointsOutputDTO(CustomerLevel customerLevel,Integer quantityOfOrders,Integer accumulatedPoints) {
}
