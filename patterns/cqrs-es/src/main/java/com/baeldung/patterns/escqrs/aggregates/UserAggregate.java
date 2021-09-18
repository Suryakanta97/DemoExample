package com.surya.patterns.escqrs.aggregates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.surya.patterns.cqrs.commands.CreateUserCommand;
import com.surya.patterns.cqrs.commands.UpdateUserCommand;
import com.surya.patterns.domain.Address;
import com.surya.patterns.domain.Contact;
import com.surya.patterns.domain.User;
import com.surya.patterns.es.events.Event;
import com.surya.patterns.es.events.UserAddressAddedEvent;
import com.surya.patterns.es.events.UserAddressRemovedEvent;
import com.surya.patterns.es.events.UserContactAddedEvent;
import com.surya.patterns.es.events.UserContactRemovedEvent;
import com.surya.patterns.es.events.UserCreatedEvent;
import com.surya.patterns.es.repository.EventStore;
import com.surya.patterns.es.service.UserUtility;

public class UserAggregate {

    private EventStore writeRepository;

    public UserAggregate(EventStore repository) {
        this.writeRepository = repository;
    }

    public List<Event> handleCreateUserCommand(CreateUserCommand command) {
        UserCreatedEvent event = new UserCreatedEvent(command.getUserId(), command.getFirstName(), command.getLastName());
        writeRepository.addEvent(command.getUserId(), event);
        return Arrays.asList(event);
    }

    public List<Event> handleUpdateUserCommand(UpdateUserCommand command) {
        User user = UserUtility.recreateUserState(writeRepository, command.getUserId());
        List<Event> events = new ArrayList<>();

        List<Contact> contactsToRemove = user.getContacts()
            .stream()
            .filter(c -> !command.getContacts()
                .contains(c))
            .collect(Collectors.toList());
        for (Contact contact : contactsToRemove) {
            UserContactRemovedEvent contactRemovedEvent = new UserContactRemovedEvent(contact.getType(), contact.getDetail());
            events.add(contactRemovedEvent);
            writeRepository.addEvent(command.getUserId(), contactRemovedEvent);
        }

        List<Contact> contactsToAdd = command.getContacts()
            .stream()
            .filter(c -> !user.getContacts()
                .contains(c))
            .collect(Collectors.toList());
        for (Contact contact : contactsToAdd) {
            UserContactAddedEvent contactAddedEvent = new UserContactAddedEvent(contact.getType(), contact.getDetail());
            events.add(contactAddedEvent);
            writeRepository.addEvent(command.getUserId(), contactAddedEvent);
        }

        List<Address> addressesToRemove = user.getAddresses()
            .stream()
            .filter(a -> !command.getAddresses()
                .contains(a))
            .collect(Collectors.toList());
        for (Address address : addressesToRemove) {
            UserAddressRemovedEvent addressRemovedEvent = new UserAddressRemovedEvent(address.getCity(), address.getState(), address.getPostcode());
            events.add(addressRemovedEvent);
            writeRepository.addEvent(command.getUserId(), addressRemovedEvent);
        }

        List<Address> addressesToAdd = command.getAddresses()
            .stream()
            .filter(a -> !user.getAddresses()
                .contains(a))
            .collect(Collectors.toList());
        for (Address address : addressesToAdd) {
            UserAddressAddedEvent addressAddedEvent = new UserAddressAddedEvent(address.getCity(), address.getState(), address.getPostcode());
            events.add(addressAddedEvent);
            writeRepository.addEvent(command.getUserId(), addressAddedEvent);
        }

        return events;
    }

}
