package no.ntnu.idatx1005.hmh.service;

import no.ntnu.idatx1005.hmh.dao.DonationDAO;
import no.ntnu.idatx1005.hmh.model.Donation;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

/**
 * Service class for Donation-related business logic.
 * Acts as an intermediary between controllers and DonationDAO.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class DonationService {
    private final DonationDAO donationDAO;

    /**
     * Constructs a DonationService.
     */
    public DonationService() {
        this.donationDAO = new DonationDAO();
    }

    /**
     * Creates a new donation after validation.
     *
     * @param donation the donation to create
     * @return the created donation
     * @throws IllegalArgumentException if donation data is invalid
     * @throws SQLException if database operation fails
     */
    public Donation createDonation(Donation donation) throws SQLException {
        validateDonation(donation);
        return donationDAO.create(donation);
    }

    /**
     * Retrieves a donation by ID.
     *
     * @param donationId the ID of the donation to retrieve
     * @return the donation, or null if not found
     * @throws SQLException if database operation fails
     */
    public Donation getDonation(Long donationId) throws SQLException {
        if (donationId == null || donationId <= 0) {
            throw new IllegalArgumentException("Donation ID must be a positive number");
        }
        return donationDAO.read(donationId);
    }

    /**
     * Updates an existing donation after validation.
     *
     * @param donation the donation to update
     * @return true if update was successful
     * @throws IllegalArgumentException if donation data is invalid
     * @throws SQLException if database operation fails
     */
    public boolean updateDonation(Donation donation) throws SQLException {
        validateDonation(donation);
        if (donation.getDonationId() == null) {
            throw new IllegalArgumentException("Donation ID cannot be null for update");
        }
        return donationDAO.update(donation);
    }

    /**
     * Deletes a donation by ID.
     *
     * @param donationId the ID of the donation to delete
     * @return true if deletion was successful
     * @throws SQLException if database operation fails
     */
    public boolean deleteDonation(Long donationId) throws SQLException {
        if (donationId == null || donationId <= 0) {
            throw new IllegalArgumentException("Donation ID must be a positive number");
        }
        return donationDAO.delete(donationId);
    }

    /**
     * Retrieves all donations.
     *
     * @return list of all donations
     * @throws SQLException if database operation fails
     */
    public List<Donation> getAllDonations() throws SQLException {
        return donationDAO.findAll();
    }

    /**
     * Retrieves donations made by a specific user.
     *
     * @param userId the ID of the user
     * @return list of donations made by the user
     * @throws SQLException if database operation fails
     */
    public List<Donation> getDonationsByUser(Long userId) throws SQLException {
        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException("User ID must be a positive number");
        }
        return donationDAO.findByUserId(userId);
    }

    /**
     * Retrieves donations received by a specific organization.
     *
     * @param organizationId the ID of the organization
     * @return list of donations received by the organization
     * @throws SQLException if database operation fails
     */
    public List<Donation> getDonationsByOrganization(Long organizationId) throws SQLException {
        if (organizationId == null || organizationId <= 0) {
            throw new IllegalArgumentException("Organization ID must be a positive number");
        }
        return donationDAO.findByOrganizationId(organizationId);
    }

    /**
     * Calculates total donations made by a user.
     *
     * @param userId the ID of the user
     * @return the total amount donated
     * @throws SQLException if database operation fails
     */
    public BigDecimal calculateTotalDonationsByUser(Long userId) throws SQLException {
        List<Donation> donations = getDonationsByUser(userId);
        return donations.stream()
                .map(Donation::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Validates donation data.
     *
     * @param donation the donation to validate
     * @throws IllegalArgumentException if donation data is invalid
     */
    private void validateDonation(Donation donation) {
        if (donation == null) {
            throw new IllegalArgumentException("Donation cannot be null");
        }
        if (donation.getUserId() == null || donation.getUserId() <= 0) {
            throw new IllegalArgumentException("Valid user ID is required");
        }
        if (donation.getOrganizationId() == null || donation.getOrganizationId() <= 0) {
            throw new IllegalArgumentException("Valid organization ID is required");
        }
        if (donation.getAmount() == null || donation.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Donation amount must be greater than zero");
        }
    }
}
