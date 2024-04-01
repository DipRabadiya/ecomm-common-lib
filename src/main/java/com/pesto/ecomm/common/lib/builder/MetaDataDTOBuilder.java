package com.pesto.ecomm.common.lib.builder;

import com.pesto.ecomm.common.lib.dto.MetaDataDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class MetaDataDTOBuilder {

    public MetaDataDTO build(Page page) {
        MetaDataDTO metaDataDTO = new MetaDataDTO();
        metaDataDTO.setCurrentPage(page.getPageable().getPageNumber());
        metaDataDTO.setTotalCount(page.getTotalElements());
        metaDataDTO.setNextPage(page.hasNext() ? metaDataDTO.getCurrentPage() + 1 : -1);
        metaDataDTO.setPrevPage(page.hasPrevious() ? metaDataDTO.getCurrentPage() - 1 : -1);
        return metaDataDTO;
    }
}
