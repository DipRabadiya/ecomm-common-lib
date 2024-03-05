package com.pesto.ecomm.common.lib.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ShippingStatus {
    PENDING,
    PACKED,
    SHIPPED,
    DELIVERED,
    RETURNED
}
