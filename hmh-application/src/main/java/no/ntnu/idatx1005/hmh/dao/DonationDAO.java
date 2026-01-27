package no.ntnu.idatx1005.hmh.dao;

import no.ntnu.idatx1005.hmh.model.Donation;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for Donation entities.
 * Handles CRUD operations for donations in the database.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class DonationDAO {
    private final DatabaseConnection dbConnection;

    /**
     * Constructs a DonationDAO.
     */
    public DonationDAO() {
        this.dbConnection = DatabaseConnection.getInstance();
    }

    /**
     * Creates a new donation in the database.
     *
     * @param donation the donation to create
     * @return the created donation with generated ID
     * @throws SQLException if database operation fails
     */
    public Donation create(Donation donation) throws SQLException {
        String sql = "INSERT INTO donations (user_id, organization_id, amount, donation_date, notes) " +
                     "VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setLong(1, donation.getUserId());
            stmt.setLong(2, donation.getOrganizationId());
            stmt.setDouble(3, donation.getAmount().doubleValue());
            stmt.setString(4, donation.getDonationDate().toString());
            stmt.setString(5, donation.getNotes());
            
            stmt.executeUpdate();
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    donation.setDonationId(generatedKeys.getLong(1));
                }
            }
        }
        
        return donation;
    }

    /**
     * Reads a donation from the database by ID.
     *
     * @param donationId the ID of the donation to retrieve
     * @return the donation, or null if not found
     * @throws SQLException if database operation fails
     */
    public Donation read(Long donationId) throws SQLException {
        String sql = "SELECT * FROM donations WHERE donation_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, donationId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return extractDonationFromResultSet(rs);
                }
            }
        }
        
        return null;
    }

    /**
     * Updates an existing donation in the database.
     *
     * @param donation the donation to update
     * @return true if update was successful
     * @throws SQLException if database operation fails
     */
    public boolean update(Donation donation) throws SQLException {
        String sql = "UPDATE donations SET user_id = ?, organization_id = ?, amount = ?, " +
                     "donation_date = ?, notes = ? WHERE donation_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, donation.getUserId());
            stmt.setLong(2, donation.getOrganizationId());
            stmt.setDouble(3, donation.getAmount().doubleValue());
            stmt.setString(4, donation.getDonationDate().toString());
            stmt.setString(5, donation.getNotes());
            stmt.setLong(6, donation.getDonationId());
            
            return stmt.executeUpdate() > 0;
        }
    }

    /**
     * Deletes a donation from the database.
     *
     * @param donationId the ID of the donation to delete
     * @return true if deletion was successful
     * @throws SQLException if database operation fails
     */
    public boolean delete(Long donationId) throws SQLException {
        String sql = "DELETE FROM donations WHERE donation_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, donationId);
            return stmt.executeUpdate() > 0;
        }
    }

    /**
     * Retrieves all donations from the database.
     *
     * @return list of all donations
     * @throws SQLException if database operation fails
     */
    public List<Donation> findAll() throws SQLException {
        List<Donation> donations = new ArrayList<>();
        String sql = "SELECT * FROM donations";
        
        try (Connection conn = dbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                donations.add(extractDonationFromResultSet(rs));
            }
        }
        
        return donations;
    }

    /**
     * Finds all donations made by a specific user.
     *
     * @param userId the ID of the user
     * @return list of donations made by the user
     * @throws SQLException if database operation fails
     */
    public List<Donation> findByUserId(Long userId) throws SQLException {
        List<Donation> donations = new ArrayList<>();
        String sql = "SELECT * FROM donations WHERE user_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, userId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    donations.add(extractDonationFromResultSet(rs));
                }
            }
        }
        
        return donations;
    }

    /**
     * Finds all donations received by a specific organization.
     *
     * @param organizationId the ID of the organization
     * @return list of donations received by the organization
     * @throws SQLException if database operation fails
     */
    public List<Donation> findByOrganizationId(Long organizationId) throws SQLException {
        List<Donation> donations = new ArrayList<>();
        String sql = "SELECT * FROM donations WHERE organization_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, organizationId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    donations.add(extractDonationFromResultSet(rs));
                }
            }
        }
        
        return donations;
    }

    /**
     * Extracts a Donation object from a ResultSet.
     *
     * @param rs the ResultSet containing donation data
     * @return the extracted Donation object
     * @throws SQLException if data extraction fails
     */
    private Donation extractDonationFromResultSet(ResultSet rs) throws SQLException {
        Donation donation = new Donation();
        donation.setDonationId(rs.getLong("donation_id"));
        donation.setUserId(rs.getLong("user_id"));
        donation.setOrganizationId(rs.getLong("organization_id"));
        donation.setAmount(BigDecimal.valueOf(rs.getDouble("amount")));
        donation.setDonationDate(LocalDateTime.parse(rs.getString("donation_date")));
        donation.setNotes(rs.getString("notes"));
        return donation;
    }
}
