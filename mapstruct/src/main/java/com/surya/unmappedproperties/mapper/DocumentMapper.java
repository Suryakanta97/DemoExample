package com.surya.unmappedproperties.mapper;

import com.surya.unmappedproperties.dto.DocumentDTO;
import com.surya.unmappedproperties.entity.Document;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DocumentMapper {

    DocumentMapper INSTANCE = Mappers.getMapper(DocumentMapper.class);

    DocumentDTO documentToDocumentDTO(Document entity);

    Document documentDTOToDocument(DocumentDTO dto);
}