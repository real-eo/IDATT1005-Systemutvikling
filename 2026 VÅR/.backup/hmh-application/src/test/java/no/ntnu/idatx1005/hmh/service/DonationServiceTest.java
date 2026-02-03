package no.ntnu.idatx1005.hmh.service;

import no.ntnu.idatx1005.hmh.model.Donation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for DonationService.
 * Tests business logic and validation.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
@DisplayName("DonationService Tests")
class DonationServiceTest {

    private DonationService donationService;

    @BeforeEach
    void setUp() {
        donationService = new DonationService();
    }

    @Test
    @DisplayName("Test create donation with null donation throws exception")
    void testCreateDonationNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            donationService.createDonation(null);
        });
    }

    @Test
    @DisplayName("Test create donation with invalid user ID throws exception")
    void testCreateDonationInvalidUserId() {
        Donation donation = new Donation();
        donation.setOrganizationId(1L);
        donation.setAmount(new BigDecimal("100.00"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            donationService.createDonation(donation);
        });
    }

    @Test
    @DisplayName("Test create donation with invalid organization ID throws exception")
    void testCreateDonationInvalidOrgId() {
        Donation donation = new Donation();
        donation.setUserId(1L);
        donation.setAmount(new BigDecimal("100.00"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            donationService.createDonation(donation);
        });
    }

    @Test
    @DisplayName("Test create donation with zero amount throws exception")
    void testCreateDonationZeroAmount() {
        Donation donation = new Donation();
        donation.setUserId(1L);
        donation.setOrganizationId(1L);
        donation.setAmount(BigDecimal.ZERO);
        
        assertThrows(IllegalArgumentException.class, () -> {
            donationService.createDonation(donation);
        });
    }

    @Test
    @DisplayName("Test create donation with negative amount throws exception")
    void testCreateDonationNegativeAmount() {
        Donation donation = new Donation();
        donation.setUserId(1L);
        donation.setOrganizationId(1L);
        donation.setAmount(new BigDecimal("-50.00"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            donationService.createDonation(donation);
        });
    }

    @Test
    @DisplayName("Test get donations by user with invalid ID throws exception")
    void testGetDonationsByUserInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            donationService.getDonationsByUser(0L);
        });
    }

    @Test
    @DisplayName("Test get donations by organization with invalid ID throws exception")
    void testGetDonationsByOrganizationInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            donationService.getDonationsByOrganization(-1L);
        });
    }
}
