package com.pesto.ecomm.common.lib.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Comparator;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BuyerProductInfoDTO extends ProductDTO {

    public BuyerProductInfoDTO(ProductDTO productDTO, List<OfferDTO> offerDTOList) {
        this.setProductName(productDTO.getProductName());
        this.setProductId(productDTO.getProductId());
        this.setDescription(productDTO.getDescription());
        offerDTOList.sort(new Comparator<OfferDTO>() {
            @Override
            public int compare(OfferDTO o1, OfferDTO o2) {
                if (o1.getPrice() < o2.getPrice())
                    return 1;
                if (o1.getPrice().equals(o2.getPrice()))
                    return 0;
                return -1;
            }
        });
        this.lowestOffer = offerDTOList.remove(0);
        this.otherOffers = offerDTOList;
    }


    OfferDTO lowestOffer;
    List<OfferDTO> otherOffers;

}
