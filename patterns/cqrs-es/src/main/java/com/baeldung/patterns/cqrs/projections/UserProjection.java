package com.surya.patterns.cqrs.projections;

import java.util.Set;

import com.surya.patterns.cqrs.queries.AddressByRegionQuery;
import com.surya.patterns.cqrs.queries.ContactByTypeQuery;
import com.surya.patterns.cqrs.repository.UserReadRepository;
import com.surya.patterns.domain.Address;
import com.surya.patterns.domain.Contact;
import com.surya.patterns.domain.UserAddress;
import com.surya.patterns.domain.UserContact;

public class UserProjection {

    private UserReadRepository repository;

    public UserProjection(UserReadRepository repository) {
        this.repository = repository;
    }

    public Set<Contact> handle(ContactByTypeQuery query) throws Exception {
        UserContact userContact = repository.getUserContact(query.getUserId());
        if (userContact == null)
            throw new Exception("User does not exist.");
        return userContact.getContactByType()
            .get(query.getContactType());
    }

    public Set<Address> handle(AddressByRegionQuery query) throws Exception {
        UserAddress userAddress = repository.getUserAddress(query.getUserId());
        if (userAddress == null)
            throw new Exception("User does not exist.");
        return userAddress.getAddressByRegion()
            .get(query.getState());
    }

}
