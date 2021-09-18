package com.surya.unmappedproperties.mapper;

import com.surya.unmappedproperties.dto.DocumentDTO;
import com.surya.unmappedproperties.entity.Document;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = IgnoreUnmappedMapperConfig.class)
public interface DocumentMapperWithConfig {

    DocumentMapperWithConfig INSTANCE = Mappers.getMapper(DocumentMapperWithConfig.class);

    DocumentDTO documentToDocumentDTO(Document entity);

    Document documentDTOToDocument(DocumentDTO dto);
}