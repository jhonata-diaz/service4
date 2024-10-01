package com.example.demo.Service1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateUser_ReturnsCreatedUser() {
        // Dado
        User user = new User("John", "Doe", "Smith", "12345678");
        when(userService.createUser(user)).thenReturn(user);

        // Cuando
        ResponseEntity<User> response = userController.createUser(user);

        // Entonces
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(user, response.getBody());
    }

    @Test
    void testGetAllUsers_ReturnsUserList() {
        // Dado
        User user1 = new User("John", "Doe", "Smith", "12345678");
        User user2 = new User("Jane", "Doe", "Smith", "87654321");
        when(userService.getAllUsers()).thenReturn(List.of(user1, user2));

        // Cuando
        ResponseEntity<List<User>> response = userController.getAllUsers();

        // Entonces
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(2, response.getBody().size());
    }
}
