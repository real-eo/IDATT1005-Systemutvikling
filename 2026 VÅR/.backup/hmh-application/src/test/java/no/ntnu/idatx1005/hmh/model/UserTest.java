package no.ntnu.idatx1005.hmh.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for User model.
 * Tests getters, setters, equals, hashCode, and toString methods.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
@DisplayName("User Model Tests")
class UserTest {

    private User user;
    private LocalDateTime testDate;

    @BeforeEach
    void setUp() {
        user = new User();
        testDate = LocalDateTime.now();
    }

    @Test
    @DisplayName("Test User default constructor")
    void testDefaultConstructor() {
        assertNotNull(user);
        assertNotNull(user.getPreferredCauses());
        assertTrue(user.getPreferredCauses().isEmpty());
        assertNotNull(user.getCreatedDate());
    }

    @Test
    @DisplayName("Test User parameterized constructor")
    void testParameterizedConstructor() {
        User testUser = new User(1L, "John Doe", "john@example.com", 
                                 "+4712345678", Arrays.asList("Health", "Education"), testDate);
        
        assertEquals(1L, testUser.getUserId());
        assertEquals("John Doe", testUser.getName());
        assertEquals("john@example.com", testUser.getEmail());
        assertEquals("+4712345678", testUser.getPhoneNumber());
        assertEquals(2, testUser.getPreferredCauses().size());
        assertEquals(testDate, testUser.getCreatedDate());
    }

    @Test
    @DisplayName("Test getter and setter for userId")
    void testUserIdGetterSetter() {
        user.setUserId(1L);
        assertEquals(1L, user.getUserId());
    }

    @Test
    @DisplayName("Test getter and setter for name")
    void testNameGetterSetter() {
        user.setName("Jane Smith");
        assertEquals("Jane Smith", user.getName());
    }

    @Test
    @DisplayName("Test getter and setter for email")
    void testEmailGetterSetter() {
        user.setEmail("jane@example.com");
        assertEquals("jane@example.com", user.getEmail());
    }

    @Test
    @DisplayName("Test equals method")
    void testEquals() {
        User user1 = new User();
        user1.setUserId(1L);
        user1.setEmail("test@example.com");

        User user2 = new User();
        user2.setUserId(1L);
        user2.setEmail("test@example.com");

        assertEquals(user1, user2);
    }

    @Test
    @DisplayName("Test hashCode method")
    void testHashCode() {
        User user1 = new User();
        user1.setUserId(1L);
        user1.setEmail("test@example.com");

        User user2 = new User();
        user2.setUserId(1L);
        user2.setEmail("test@example.com");

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    @DisplayName("Test toString method")
    void testToString() {
        user.setUserId(1L);
        user.setName("Test User");
        String result = user.toString();
        
        assertTrue(result.contains("userId=1"));
        assertTrue(result.contains("name='Test User'"));
    }
}
