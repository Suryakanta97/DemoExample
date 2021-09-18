package com.surya.mapstruct.mappingCollections.mapper;

import com.surya.mapstruct.mappingCollections.dto.CompanyDTO;
import com.surya.mapstruct.mappingCollections.model.Company;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        uses = EmployeeMapper.class)
public interface CompanyMapperAdderPreferred {

    CompanyDTO map(Company company);
}
