package no.ntnu.idatx1005.hmh.model;

import java.util.Objects;

/**
 * Represents an organization in the Help Me Help application.
 * Organizations can receive donations and are verified through Innsamlingskontrollen (IK).
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class Organization {
    private Long organizationId;
    private String name;
    private String registrationNumber;
    private String description;
    private String category;
    private String websiteUrl;
    private boolean isVerified;
    private String innsamlingsKontrollenStatus;

    /**
     * Default constructor for Organization.
     */
    public Organization() {
        this.isVerified = false;
    }

    /**
     * Constructs an Organization with specified details.
     *
     * @param organizationId the unique identifier for the organization
     * @param name the organization's name
     * @param registrationNumber the organization's registration number
     * @param description the organization's description
     * @param category the category of the organization
     * @param websiteUrl the organization's website URL
     * @param isVerified whether the organization is verified
     * @param innsamlingsKontrollenStatus the Innsamlingskontrollen verification status
     */
    public Organization(Long organizationId, String name, String registrationNumber,
                        String description, String category, String websiteUrl,
                        boolean isVerified, String innsamlingsKontrollenStatus) {
        this.organizationId = organizationId;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.description = description;
        this.category = category;
        this.websiteUrl = websiteUrl;
        this.isVerified = isVerified;
        this.innsamlingsKontrollenStatus = innsamlingsKontrollenStatus;
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
     * Gets the organization's name.
     *
     * @return the organization's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the organization's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the organization's registration number.
     *
     * @return the registration number
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the organization's registration number.
     *
     * @param registrationNumber the registration number to set
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Gets the organization's description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the organization's description.
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the organization's category.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the organization's category.
     *
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets the organization's website URL.
     *
     * @return the website URL
     */
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    /**
     * Sets the organization's website URL.
     *
     * @param websiteUrl the website URL to set
     */
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    /**
     * Checks if the organization is verified.
     *
     * @return true if verified, false otherwise
     */
    public boolean isVerified() {
        return isVerified;
    }

    /**
     * Sets whether the organization is verified.
     *
     * @param verified the verification status to set
     */
    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    /**
     * Gets the Innsamlingskontrollen verification status.
     *
     * @return the IK status
     */
    public String getInnsamlingsKontrollenStatus() {
        return innsamlingsKontrollenStatus;
    }

    /**
     * Sets the Innsamlingskontrollen verification status.
     *
     * @param innsamlingsKontrollenStatus the IK status to set
     */
    public void setInnsamlingsKontrollenStatus(String innsamlingsKontrollenStatus) {
        this.innsamlingsKontrollenStatus = innsamlingsKontrollenStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(organizationId, that.organizationId) &&
               Objects.equals(registrationNumber, that.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, registrationNumber);
    }

    @Override
    public String toString() {
        return "Organization{" +
               "organizationId=" + organizationId +
               ", name='" + name + '\'' +
               ", registrationNumber='" + registrationNumber + '\'' +
               ", description='" + description + '\'' +
               ", category='" + category + '\'' +
               ", websiteUrl='" + websiteUrl + '\'' +
               ", isVerified=" + isVerified +
               ", innsamlingsKontrollenStatus='" + innsamlingsKontrollenStatus + '\'' +
               '}';
    }
}
