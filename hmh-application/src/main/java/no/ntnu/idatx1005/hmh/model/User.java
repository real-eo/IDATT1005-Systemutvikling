package no.ntnu.idatx1005.hmh.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a user in the Help Me Help application.
 * Users can donate to organizations and maintain preferences for causes they care about.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class User {
    private Long userId;
    private String name;
    private String email;
    private String phoneNumber;
    private List<String> preferredCauses;
    private LocalDateTime createdDate;

    /**
     * Default constructor for User.
     * Initializes preferredCauses as an empty ArrayList and sets createdDate to current time.
     */
    public User() {
        this.preferredCauses = new ArrayList<>();
        this.createdDate = LocalDateTime.now();
    }

    /**
     * Constructs a User with specified details.
     *
     * @param userId the unique identifier for the user
     * @param name the user's name
     * @param email the user's email address
     * @param phoneNumber the user's phone number
     * @param preferredCauses list of causes the user prefers to support
     * @param createdDate the date and time when the user was created
     */
    public User(Long userId, String name, String email, String phoneNumber, 
                List<String> preferredCauses, LocalDateTime createdDate) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.preferredCauses = preferredCauses != null ? preferredCauses : new ArrayList<>();
        this.createdDate = createdDate != null ? createdDate : LocalDateTime.now();
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
     * Gets the user's name.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the user's email address.
     *
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email address.
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user's phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the user's phone number.
     *
     * @param phoneNumber the phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * Gets the date and time when the user was created.
     *
     * @return the creation date
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the date and time when the user was created.
     *
     * @param createdDate the creation date to set
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
               Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, email);
    }

    @Override
    public String toString() {
        return "User{" +
               "userId=" + userId +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", preferredCauses=" + preferredCauses +
               ", createdDate=" + createdDate +
               '}';
    }
}
