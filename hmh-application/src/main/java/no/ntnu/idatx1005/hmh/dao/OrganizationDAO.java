package no.ntnu.idatx1005.hmh.dao;

import no.ntnu.idatx1005.hmh.model.Organization;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for Organization entities.
 * Handles CRUD operations for organizations in the database.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class OrganizationDAO {
    private final DatabaseConnection dbConnection;

    /**
     * Constructs an OrganizationDAO.
     */
    public OrganizationDAO() {
        this.dbConnection = DatabaseConnection.getInstance();
    }

    /**
     * Creates a new organization in the database.
     *
     * @param organization the organization to create
     * @return the created organization with generated ID
     * @throws SQLException if database operation fails
     */
    public Organization create(Organization organization) throws SQLException {
        String sql = "INSERT INTO organizations (name, registration_number, description, category, " +
                     "website_url, is_verified, ik_status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, organization.getName());
            stmt.setString(2, organization.getRegistrationNumber());
            stmt.setString(3, organization.getDescription());
            stmt.setString(4, organization.getCategory());
            stmt.setString(5, organization.getWebsiteUrl());
            stmt.setInt(6, organization.isVerified() ? 1 : 0);
            stmt.setString(7, organization.getInnsamlingsKontrollenStatus());
            
            stmt.executeUpdate();
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    organization.setOrganizationId(generatedKeys.getLong(1));
                }
            }
        }
        
        return organization;
    }

    /**
     * Reads an organization from the database by ID.
     *
     * @param organizationId the ID of the organization to retrieve
     * @return the organization, or null if not found
     * @throws SQLException if database operation fails
     */
    public Organization read(Long organizationId) throws SQLException {
        String sql = "SELECT * FROM organizations WHERE organization_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, organizationId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return extractOrganizationFromResultSet(rs);
                }
            }
        }
        
        return null;
    }

    /**
     * Updates an existing organization in the database.
     *
     * @param organization the organization to update
     * @return true if update was successful
     * @throws SQLException if database operation fails
     */
    public boolean update(Organization organization) throws SQLException {
        String sql = "UPDATE organizations SET name = ?, registration_number = ?, description = ?, " +
                     "category = ?, website_url = ?, is_verified = ?, ik_status = ? " +
                     "WHERE organization_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, organization.getName());
            stmt.setString(2, organization.getRegistrationNumber());
            stmt.setString(3, organization.getDescription());
            stmt.setString(4, organization.getCategory());
            stmt.setString(5, organization.getWebsiteUrl());
            stmt.setInt(6, organization.isVerified() ? 1 : 0);
            stmt.setString(7, organization.getInnsamlingsKontrollenStatus());
            stmt.setLong(8, organization.getOrganizationId());
            
            return stmt.executeUpdate() > 0;
        }
    }

    /**
     * Deletes an organization from the database.
     *
     * @param organizationId the ID of the organization to delete
     * @return true if deletion was successful
     * @throws SQLException if database operation fails
     */
    public boolean delete(Long organizationId) throws SQLException {
        String sql = "DELETE FROM organizations WHERE organization_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, organizationId);
            return stmt.executeUpdate() > 0;
        }
    }

    /**
     * Retrieves all organizations from the database.
     *
     * @return list of all organizations
     * @throws SQLException if database operation fails
     */
    public List<Organization> findAll() throws SQLException {
        List<Organization> organizations = new ArrayList<>();
        String sql = "SELECT * FROM organizations";
        
        try (Connection conn = dbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                organizations.add(extractOrganizationFromResultSet(rs));
            }
        }
        
        return organizations;
    }

    /**
     * Finds organizations by category.
     *
     * @param category the category to filter by
     * @return list of organizations in the specified category
     * @throws SQLException if database operation fails
     */
    public List<Organization> findByCategory(String category) throws SQLException {
        List<Organization> organizations = new ArrayList<>();
        String sql = "SELECT * FROM organizations WHERE category = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, category);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    organizations.add(extractOrganizationFromResultSet(rs));
                }
            }
        }
        
        return organizations;
    }

    /**
     * Finds verified organizations.
     *
     * @return list of verified organizations
     * @throws SQLException if database operation fails
     */
    public List<Organization> findVerified() throws SQLException {
        List<Organization> organizations = new ArrayList<>();
        String sql = "SELECT * FROM organizations WHERE is_verified = 1";
        
        try (Connection conn = dbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                organizations.add(extractOrganizationFromResultSet(rs));
            }
        }
        
        return organizations;
    }

    /**
     * Extracts an Organization object from a ResultSet.
     *
     * @param rs the ResultSet containing organization data
     * @return the extracted Organization object
     * @throws SQLException if data extraction fails
     */
    private Organization extractOrganizationFromResultSet(ResultSet rs) throws SQLException {
        Organization organization = new Organization();
        organization.setOrganizationId(rs.getLong("organization_id"));
        organization.setName(rs.getString("name"));
        organization.setRegistrationNumber(rs.getString("registration_number"));
        organization.setDescription(rs.getString("description"));
        organization.setCategory(rs.getString("category"));
        organization.setWebsiteUrl(rs.getString("website_url"));
        organization.setVerified(rs.getInt("is_verified") == 1);
        organization.setInnsamlingsKontrollenStatus(rs.getString("ik_status"));
        return organization;
    }
}
