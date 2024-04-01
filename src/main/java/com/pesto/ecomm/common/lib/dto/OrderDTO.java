package com.pesto.ecomm.common.lib.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pesto.ecomm.common.lib.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderDTO {

    private String orderId;
    private String productId;
    private String buyerName;
    private OrderStatus orderStatus;
    private String buyerId;
    private Double totalPrice;
    private List<OrderItemDTO> orderItems;


}
