package no.ntnu.idatx1005.hmh.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a user profile in the Help Me Help application.
 * Contains aggregated information about a user's donation activity and preferences.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class Profile {
    private Long profileId;
    private Long userId;
    private List<String> preferredCauses;
    private BigDecimal totalDonated;
    private int numberOfDonations;

    /**
     * Default constructor for Profile.
     * Initializes preferredCauses as an empty ArrayList, totalDonated to zero, and numberOfDonations to 0.
     */
    public Profile() {
        this.preferredCauses = new ArrayList<>();
        this.totalDonated = BigDecimal.ZERO;
        this.numberOfDonations = 0;
    }

    /**
     * Constructs a Profile with specified details.
     *
     * @param profileId the unique identifier for the profile
     * @param userId the ID of the user this profile belongs to
     * @param preferredCauses list of causes the user prefers to support
     * @param totalDonated the total amount donated by the user
     * @param numberOfDonations the number of donations made by the user
     */
    public Profile(Long profileId, Long userId, List<String> preferredCauses,
                   BigDecimal totalDonated, int numberOfDonations) {
        this.profileId = profileId;
        this.userId = userId;
        this.preferredCauses = preferredCauses != null ? preferredCauses : new ArrayList<>();
        this.totalDonated = totalDonated != null ? totalDonated : BigDecimal.ZERO;
        this.numberOfDonations = numberOfDonations;
    }

    /**
     * Gets the profile ID.
     *
     * @return the profile ID
     */
    public Long getProfileId() {
        return profileId;
    }

    /**
     * Sets the profile ID.
     *
     * @param profileId the profile ID to set
     */
    public void setProfileId(Long profileId) {
        this.profileId = profileId;
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
     * Gets the list of preferred causes.
     *
     * @return the list of preferred causes
     */
    public List<String> getPreferredCauses() {
        return preferredCauses;
    }

    /**
     * Sets the list of preferred causes.
     *
     * @param preferredCauses the list of preferred causes to set
     */
    public void setPreferredCauses(List<String> preferredCauses) {
        this.preferredCauses = preferredCauses != null ? preferredCauses : new ArrayList<>();
    }

    /**
     * Gets the total amount donated.
     *
     * @return the total donated amount
     */
    public BigDecimal getTotalDonated() {
        return totalDonated;
    }

    /**
     * Sets the total amount donated.
     *
     * @param totalDonated the total donated amount to set
     */
    public void setTotalDonated(BigDecimal totalDonated) {
        this.totalDonated = totalDonated;
    }

    /**
     * Gets the number of donations made.
     *
     * @return the number of donations
     */
    public int getNumberOfDonations() {
        return numberOfDonations;
    }

    /**
     * Sets the number of donations made.
     *
     * @param numberOfDonations the number of donations to set
     */
    public void setNumberOfDonations(int numberOfDonations) {
        this.numberOfDonations = numberOfDonations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(profileId, profile.profileId) &&
               Objects.equals(userId, profile.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, userId);
    }

    @Override
    public String toString() {
        return "Profile{" +
               "profileId=" + profileId +
               ", userId=" + userId +
               ", preferredCauses=" + preferredCauses +
               ", totalDonated=" + totalDonated +
               ", numberOfDonations=" + numberOfDonations +
               '}';
    }
}
