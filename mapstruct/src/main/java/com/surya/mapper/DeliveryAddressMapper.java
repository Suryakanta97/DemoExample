package com.surya.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.surya.entity.Address;
import com.surya.entity.Customer;
import com.surya.entity.DeliveryAddress;

@Mapper
public interface DeliveryAddressMapper {

    @Mapping(source = "customer.firstName", target = "forename")
    @Mapping(source = "customer.lastName", target = "surname")
    @Mapping(source = "address.street", target = "street")
    @Mapping(source = "address.postalcode", target = "postalcode")
    @Mapping(source = "address.county", target = "county")
    DeliveryAddress from(Customer customer, Address address);

    @Mapping(source = "address.postalcode", target = "postalcode")
    @Mapping(source = "address.county", target = "county")
    DeliveryAddress updateAddress(@MappingTarget DeliveryAddress deliveryAddress, Address address);
}
