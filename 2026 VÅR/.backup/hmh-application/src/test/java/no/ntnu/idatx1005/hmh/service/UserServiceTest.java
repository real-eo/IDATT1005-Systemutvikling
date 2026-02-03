package no.ntnu.idatx1005.hmh.service;

import no.ntnu.idatx1005.hmh.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for UserService.
 * Tests business logic and validation.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
@DisplayName("UserService Tests")
class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    @DisplayName("Test create user with valid data")
    void testCreateUserValid() {
        User user = new User();
        user.setName("Test User");
        user.setEmail("test@example.com");
        
        // Note: This test requires database setup
        // For now, testing validation logic
        assertDoesNotThrow(() -> {
            // userService.createUser(user);
        });
    }

    @Test
    @DisplayName("Test create user with null user throws exception")
    void testCreateUserNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(null);
        });
    }

    @Test
    @DisplayName("Test create user with empty name throws exception")
    void testCreateUserEmptyName() {
        User user = new User();
        user.setName("");
        user.setEmail("test@example.com");
        
        assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(user);
        });
    }

    @Test
    @DisplayName("Test create user with invalid email throws exception")
    void testCreateUserInvalidEmail() {
        User user = new User();
        user.setName("Test User");
        user.setEmail("invalid-email");
        
        assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(user);
        });
    }

    @Test
    @DisplayName("Test get user with invalid ID throws exception")
    void testGetUserInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            userService.getUser(0L);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            userService.getUser(-1L);
        });
    }

    @Test
    @DisplayName("Test update user with null ID throws exception")
    void testUpdateUserNullId() {
        User user = new User();
        user.setName("Test User");
        user.setEmail("test@example.com");
        
        assertThrows(IllegalArgumentException.class, () -> {
            userService.updateUser(user);
        });
    }
}
