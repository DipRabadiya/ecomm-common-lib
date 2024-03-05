package com.pesto.ecomm.common.lib.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {

    PENDING,
    PROCESSING,
    DISPATCHED,
    COMPLETED,
    CANCELLED,
    PARTIALLY_CANCELLED

}
