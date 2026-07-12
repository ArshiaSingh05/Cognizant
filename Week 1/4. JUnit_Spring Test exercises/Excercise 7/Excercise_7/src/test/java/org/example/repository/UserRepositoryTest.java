package org.example.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.example.entity.User;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    @Test
    void testFindByName() {

        UserRepository repository = mock(UserRepository.class);

        User user = new User();
        user.setId(1L);
        user.setName("John");

        when(repository.findByName("John"))
                .thenReturn(Optional.of(user));

        assertEquals("John",
                repository.findByName("John").get().getName());
    }
}