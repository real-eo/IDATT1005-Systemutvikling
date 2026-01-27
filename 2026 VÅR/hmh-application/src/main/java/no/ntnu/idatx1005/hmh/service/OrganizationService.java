package no.ntnu.idatx1005.hmh.service;

import no.ntnu.idatx1005.hmh.dao.OrganizationDAO;
import no.ntnu.idatx1005.hmh.model.Organization;

import java.sql.SQLException;
import java.util.List;

/**
 * Service class for Organization-related business logic.
 * Acts as an intermediary between controllers and OrganizationDAO.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class OrganizationService {
    private final OrganizationDAO organizationDAO;

    /**
     * Constructs an OrganizationService.
     */
    public OrganizationService() {
        this.organizationDAO = new OrganizationDAO();
    }

    /**
     * Creates a new organization after validation.
     *
     * @param organization the organization to create
     * @return the created organization
     * @throws IllegalArgumentException if organization data is invalid
     * @throws SQLException if database operation fails
     */
    public Organization createOrganization(Organization organization) throws SQLException {
        validateOrganization(organization);
        return organizationDAO.create(organization);
    }

    /**
     * Retrieves an organization by ID.
     *
     * @param organizationId the ID of the organization to retrieve
     * @return the organization, or null if not found
     * @throws SQLException if database operation fails
     */
    public Organization getOrganization(Long organizationId) throws SQLException {
        if (organizationId == null || organizationId <= 0) {
            throw new IllegalArgumentException("Organization ID must be a positive number");
        }
        return organizationDAO.read(organizationId);
    }

    /**
     * Updates an existing organization after validation.
     *
     * @param organization the organization to update
     * @return true if update was successful
     * @throws IllegalArgumentException if organization data is invalid
     * @throws SQLException if database operation fails
     */
    public boolean updateOrganization(Organization organization) throws SQLException {
        validateOrganization(organization);
        if (organization.getOrganizationId() == null) {
            throw new IllegalArgumentException("Organization ID cannot be null for update");
        }
        return organizationDAO.update(organization);
    }

    /**
     * Deletes an organization by ID.
     *
     * @param organizationId the ID of the organization to delete
     * @return true if deletion was successful
     * @throws SQLException if database operation fails
     */
    public boolean deleteOrganization(Long organizationId) throws SQLException {
        if (organizationId == null || organizationId <= 0) {
            throw new IllegalArgumentException("Organization ID must be a positive number");
        }
        return organizationDAO.delete(organizationId);
    }

    /**
     * Retrieves all organizations.
     *
     * @return list of all organizations
     * @throws SQLException if database operation fails
     */
    public List<Organization> getAllOrganizations() throws SQLException {
        return organizationDAO.findAll();
    }

    /**
     * Retrieves verified organizations.
     *
     * @return list of verified organizations
     * @throws SQLException if database operation fails
     */
    public List<Organization> getVerifiedOrganizations() throws SQLException {
        return organizationDAO.findVerified();
    }

    /**
     * Retrieves organizations by category.
     *
     * @param category the category to filter by
     * @return list of organizations in the specified category
     * @throws SQLException if database operation fails
     */
    public List<Organization> getOrganizationsByCategory(String category) throws SQLException {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Category cannot be empty");
        }
        return organizationDAO.findByCategory(category);
    }

    /**
     * Validates organization data.
     *
     * @param organization the organization to validate
     * @throws IllegalArgumentException if organization data is invalid
     */
    private void validateOrganization(Organization organization) {
        if (organization == null) {
            throw new IllegalArgumentException("Organization cannot be null");
        }
        if (organization.getName() == null || organization.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Organization name cannot be empty");
        }
    }
}
