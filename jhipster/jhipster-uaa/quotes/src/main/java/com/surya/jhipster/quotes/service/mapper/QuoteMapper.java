package com.surya.jhipster.quotes.service.mapper;

import com.surya.jhipster.quotes.domain.*;
import com.surya.jhipster.quotes.service.dto.QuoteDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Quote and its DTO QuoteDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface QuoteMapper extends EntityMapper<QuoteDTO, Quote> {



    default Quote fromId(Long id) {
        if (id == null) {
            return null;
        }
        Quote quote = new Quote();
        quote.setId(id);
        return quote;
    }
}
