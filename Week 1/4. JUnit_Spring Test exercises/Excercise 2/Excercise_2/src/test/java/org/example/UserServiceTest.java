package org.example.service;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testGetUserById() {

        UserRepository repository = mock(UserRepository.class);

        User user = new User();
        user.setId(1L);
        user.setName("John");

        when(repository.findById(1L)).thenReturn(Optional.of(user));

        UserService service = new UserService();

        java.lang.reflect.Field field;
        try {
            field = UserService.class.getDeclaredField("userRepository");
            field.setAccessible(true);
            field.set(service, repository);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals("John", service.getUserById(1L).getName());
    }
}