package com.surya.projection.repository;

import com.surya.projection.view.AddressView;
import com.surya.projection.model.Address;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AddressRepository extends Repository<Address, Long> {
    List<AddressView> getAddressByState(String state);
}
