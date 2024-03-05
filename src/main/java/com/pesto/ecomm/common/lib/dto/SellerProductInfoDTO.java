package com.pesto.ecomm.common.lib.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SellerProductInfoDTO extends ProductDTO {

    public SellerProductInfoDTO(ProductDTO productDTO, OfferDTO offerDTO) {
        this.setProductName(productDTO.getProductName());
        this.setProductId(productDTO.getProductId());
        this.setDescription(productDTO.getDescription());
        this.sellerOffer = offerDTO;
    }

    OfferDTO sellerOffer;

}
