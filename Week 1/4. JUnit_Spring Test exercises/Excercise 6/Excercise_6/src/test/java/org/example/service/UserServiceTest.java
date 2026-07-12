package org.example.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.example.repository.UserRepository;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void testUserNotFound() throws Exception {

        UserRepository repository = mock(UserRepository.class);

        when(repository.findById(1L)).thenReturn(Optional.empty());

        UserService service = new UserService();

        Field field = UserService.class.getDeclaredField("userRepository");
        field.setAccessible(true);
        field.set(service, repository);

        assertThrows(NoSuchElementException.class,
                () -> service.getUserById(1L));
    }
}