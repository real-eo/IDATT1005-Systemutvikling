package no.ntnu.idatx1005.hmh.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Donation model.
 * Tests getters, setters, equals, hashCode, and toString methods.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
@DisplayName("Donation Model Tests")
class DonationTest {

    private Donation donation;

    @BeforeEach
    void setUp() {
        donation = new Donation();
    }

    @Test
    @DisplayName("Test Donation default constructor")
    void testDefaultConstructor() {
        assertNotNull(donation);
        assertNotNull(donation.getAmount());
        assertEquals(BigDecimal.ZERO, donation.getAmount());
        assertNotNull(donation.getDonationDate());
    }

    @Test
    @DisplayName("Test Donation parameterized constructor")
    void testParameterizedConstructor() {
        LocalDateTime testDate = LocalDateTime.now();
        BigDecimal amount = new BigDecimal("100.50");
        
        Donation testDonation = new Donation(1L, 2L, 3L, amount, testDate, "Test donation");
        
        assertEquals(1L, testDonation.getDonationId());
        assertEquals(2L, testDonation.getUserId());
        assertEquals(3L, testDonation.getOrganizationId());
        assertEquals(amount, testDonation.getAmount());
        assertEquals(testDate, testDonation.getDonationDate());
        assertEquals("Test donation", testDonation.getNotes());
    }

    @Test
    @DisplayName("Test getter and setter for donationId")
    void testDonationIdGetterSetter() {
        donation.setDonationId(1L);
        assertEquals(1L, donation.getDonationId());
    }

    @Test
    @DisplayName("Test getter and setter for amount")
    void testAmountGetterSetter() {
        BigDecimal amount = new BigDecimal("250.75");
        donation.setAmount(amount);
        assertEquals(amount, donation.getAmount());
    }

    @Test
    @DisplayName("Test getter and setter for userId")
    void testUserIdGetterSetter() {
        donation.setUserId(5L);
        assertEquals(5L, donation.getUserId());
    }

    @Test
    @DisplayName("Test equals method")
    void testEquals() {
        Donation donation1 = new Donation();
        donation1.setDonationId(1L);

        Donation donation2 = new Donation();
        donation2.setDonationId(1L);

        assertEquals(donation1, donation2);
    }

    @Test
    @DisplayName("Test hashCode method")
    void testHashCode() {
        Donation donation1 = new Donation();
        donation1.setDonationId(1L);

        Donation donation2 = new Donation();
        donation2.setDonationId(1L);

        assertEquals(donation1.hashCode(), donation2.hashCode());
    }

    @Test
    @DisplayName("Test toString method")
    void testToString() {
        donation.setDonationId(1L);
        donation.setAmount(new BigDecimal("100.00"));
        String result = donation.toString();
        
        assertTrue(result.contains("donationId=1"));
        assertTrue(result.contains("amount=100"));
    }
}
