package com.pesto.ecomm.common.lib.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pesto.ecomm.common.lib.enums.OrderStatus;
import com.pesto.ecomm.common.lib.enums.ShippingStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderItemDTO {

    private String orderItemId;
    private String offerId;
    private String orderId;
    private String sellerName;
    private OrderStatus status;
    private String sellerId;
    private String productName;
    private Integer quantity;
    private Double price;
    private ShippingStatus shippingStatus;

}
