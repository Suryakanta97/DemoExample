package com.surya.mapstruct.mappingCollections.mapper;

import com.surya.mapstruct.mappingCollections.dto.CompanyDTO;
import com.surya.mapstruct.mappingCollections.model.Company;
import org.mapstruct.Mapper;

@Mapper(uses = EmployeeMapper.class)
public interface CompanyMapper {

    CompanyDTO map(Company company);
}
