package no.ntnu.idatx1005.hmh.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a donation made by a user to an organization in the Help Me Help application.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class Donation {
    private Long donationId;
    private Long userId;
    private Long organizationId;
    private BigDecimal amount;
    private LocalDateTime donationDate;
    private String notes;

    /**
     * Default constructor for Donation.
     * Sets donationDate to current time.
     */
    public Donation() {
        this.donationDate = LocalDateTime.now();
        this.amount = BigDecimal.ZERO;
    }

    /**
     * Constructs a Donation with specified details.
     *
     * @param donationId the unique identifier for the donation
     * @param userId the ID of the user making the donation
     * @param organizationId the ID of the organization receiving the donation
     * @param amount the donation amount
     * @param donationDate the date and time when the donation was made
     * @param notes additional notes about the donation
     */
    public Donation(Long donationId, Long userId, Long organizationId,
                    BigDecimal amount, LocalDateTime donationDate, String notes) {
        this.donationId = donationId;
        this.userId = userId;
        this.organizationId = organizationId;
        this.amount = amount != null ? amount : BigDecimal.ZERO;
        this.donationDate = donationDate != null ? donationDate : LocalDateTime.now();
        this.notes = notes;
    }

    /**
     * Gets the donation ID.
     *
     * @return the donation ID
     */
    public Long getDonationId() {
        return donationId;
    }

    /**
     * Sets the donation ID.
     *
     * @param donationId the donation ID to set
     */
    public void setDonationId(Long donationId) {
        this.donationId = donationId;
    }

    /**
     * Gets the user ID.
     *
     * @return the user ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the user ID.
     *
     * @param userId the user ID to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Gets the organization ID.
     *
     * @return the organization ID
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the organization ID.
     *
     * @param organizationId the organization ID to set
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * Gets the donation amount.
     *
     * @return the donation amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the donation amount.
     *
     * @param amount the donation amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Gets the donation date and time.
     *
     * @return the donation date
     */
    public LocalDateTime getDonationDate() {
        return donationDate;
    }

    /**
     * Sets the donation date and time.
     *
     * @param donationDate the donation date to set
     */
    public void setDonationDate(LocalDateTime donationDate) {
        this.donationDate = donationDate;
    }

    /**
     * Gets the notes about the donation.
     *
     * @return the donation notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the notes about the donation.
     *
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Objects.equals(donationId, donation.donationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(donationId);
    }

    @Override
    public String toString() {
        return "Donation{" +
               "donationId=" + donationId +
               ", userId=" + userId +
               ", organizationId=" + organizationId +
               ", amount=" + amount +
               ", donationDate=" + donationDate +
               ", notes='" + notes + '\'' +
               '}';
    }
}
