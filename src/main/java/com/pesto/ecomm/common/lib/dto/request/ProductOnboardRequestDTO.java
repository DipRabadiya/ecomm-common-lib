package com.pesto.ecomm.common.lib.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class ProductOnboardRequestDTO {

    private String productId;
    private String offerId;
    private String productName;
    private String productDescription;
    private Integer availableInventory;
    private Double price;
    private String sellerId;

}
