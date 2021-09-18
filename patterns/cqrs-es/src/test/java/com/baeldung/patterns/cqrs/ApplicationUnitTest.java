package com.surya.patterns.cqrs;

import static org.junit.Assert.assertEquals;

import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.surya.patterns.cqrs.aggregates.UserAggregate;
import com.surya.patterns.cqrs.commands.CreateUserCommand;
import com.surya.patterns.cqrs.commands.UpdateUserCommand;
import com.surya.patterns.cqrs.projections.UserProjection;
import com.surya.patterns.cqrs.projectors.UserProjector;
import com.surya.patterns.cqrs.queries.AddressByRegionQuery;
import com.surya.patterns.cqrs.queries.ContactByTypeQuery;
import com.surya.patterns.cqrs.repository.UserReadRepository;
import com.surya.patterns.cqrs.repository.UserWriteRepository;
import com.surya.patterns.domain.Address;
import com.surya.patterns.domain.Contact;
import com.surya.patterns.domain.User;

public class ApplicationUnitTest {

    private UserWriteRepository writeRepository;
    private UserReadRepository readRepository;
    private UserProjector projector;
    private UserAggregate userAggregate;
    private UserProjection userProjection;

    @Before
    public void setUp() {
        writeRepository = new UserWriteRepository();
        readRepository = new UserReadRepository();
        projector = new UserProjector(readRepository);
        userAggregate = new UserAggregate(writeRepository);
        userProjection = new UserProjection(readRepository);
    }

    @Test
    public void givenCQRSApplication_whenCommandRun_thenQueryShouldReturnResult() throws Exception {
        String userId = UUID.randomUUID()
            .toString();
        User user = null;
        CreateUserCommand createUserCommand = new CreateUserCommand(userId, "Tom", "Sawyer");
        user = userAggregate.handleCreateUserCommand(createUserCommand);
        projector.project(user);

        UpdateUserCommand updateUserCommand = new UpdateUserCommand(user.getUserid(), Stream.of(new Address("New York", "NY", "10001"), new Address("Los Angeles", "CA", "90001"))
            .collect(Collectors.toSet()),
            Stream.of(new Contact("EMAIL", "tom.sawyer@gmail.com"), new Contact("EMAIL", "tom.sawyer@rediff.com"))
                .collect(Collectors.toSet()));
        user = userAggregate.handleUpdateUserCommand(updateUserCommand);
        projector.project(user);

        updateUserCommand = new UpdateUserCommand(userId, Stream.of(new Address("New York", "NY", "10001"), new Address("Housten", "TX", "77001"))
            .collect(Collectors.toSet()),
            Stream.of(new Contact("EMAIL", "tom.sawyer@gmail.com"), new Contact("PHONE", "700-000-0001"))
                .collect(Collectors.toSet()));
        user = userAggregate.handleUpdateUserCommand(updateUserCommand);
        projector.project(user);

        ContactByTypeQuery contactByTypeQuery = new ContactByTypeQuery(userId, "EMAIL");
        assertEquals(Stream.of(new Contact("EMAIL", "tom.sawyer@gmail.com"))
            .collect(Collectors.toSet()), userProjection.handle(contactByTypeQuery));
        AddressByRegionQuery addressByRegionQuery = new AddressByRegionQuery(userId, "NY");
        assertEquals(Stream.of(new Address("New York", "NY", "10001"))
            .collect(Collectors.toSet()), userProjection.handle(addressByRegionQuery));

    }

}
