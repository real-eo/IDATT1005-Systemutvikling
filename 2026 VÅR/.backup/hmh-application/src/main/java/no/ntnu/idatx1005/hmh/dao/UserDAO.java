package no.ntnu.idatx1005.hmh.dao;

import no.ntnu.idatx1005.hmh.model.User;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Data Access Object for User entities.
 * Handles CRUD operations for users in the database.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class UserDAO {
    private final DatabaseConnection dbConnection;

    /**
     * Constructs a UserDAO.
     */
    public UserDAO() {
        this.dbConnection = DatabaseConnection.getInstance();
    }

    /**
     * Creates a new user in the database.
     *
     * @param user the user to create
     * @return the created user with generated ID
     * @throws SQLException if database operation fails
     */
    public User create(User user) throws SQLException {
        String sql = "INSERT INTO users (name, email, phone_number, created_date) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPhoneNumber());
            stmt.setString(4, user.getCreatedDate().toString());
            
            stmt.executeUpdate();
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setUserId(generatedKeys.getLong(1));
                    savePreferredCauses(user);
                }
            }
        }
        
        return user;
    }

    /**
     * Reads a user from the database by ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the user, or null if not found
     * @throws SQLException if database operation fails
     */
    public User read(Long userId) throws SQLException {
        String sql = "SELECT * FROM users WHERE user_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, userId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    User user = extractUserFromResultSet(rs);
                    user.setPreferredCauses(getPreferredCauses(userId));
                    return user;
                }
            }
        }
        
        return null;
    }

    /**
     * Updates an existing user in the database.
     *
     * @param user the user to update
     * @return true if update was successful
     * @throws SQLException if database operation fails
     */
    public boolean update(User user) throws SQLException {
        String sql = "UPDATE users SET name = ?, email = ?, phone_number = ? WHERE user_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPhoneNumber());
            stmt.setLong(4, user.getUserId());
            
            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                updatePreferredCauses(user);
                return true;
            }
        }
        
        return false;
    }

    /**
     * Deletes a user from the database.
     *
     * @param userId the ID of the user to delete
     * @return true if deletion was successful
     * @throws SQLException if database operation fails
     */
    public boolean delete(Long userId) throws SQLException {
        deletePreferredCauses(userId);
        
        String sql = "DELETE FROM users WHERE user_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, userId);
            return stmt.executeUpdate() > 0;
        }
    }

    /**
     * Retrieves all users from the database.
     *
     * @return list of all users
     * @throws SQLException if database operation fails
     */
    public List<User> findAll() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        
        try (Connection conn = dbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                User user = extractUserFromResultSet(rs);
                user.setPreferredCauses(getPreferredCauses(user.getUserId()));
                users.add(user);
            }
        }
        
        return users;
    }

    /**
     * Extracts a User object from a ResultSet.
     *
     * @param rs the ResultSet containing user data
     * @return the extracted User object
     * @throws SQLException if data extraction fails
     */
    private User extractUserFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();
        user.setUserId(rs.getLong("user_id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setPhoneNumber(rs.getString("phone_number"));
        user.setCreatedDate(LocalDateTime.parse(rs.getString("created_date")));
        return user;
    }

    /**
     * Saves preferred causes for a user.
     *
     * @param user the user whose preferred causes to save
     * @throws SQLException if database operation fails
     */
    private void savePreferredCauses(User user) throws SQLException {
        if (user.getPreferredCauses() == null || user.getPreferredCauses().isEmpty()) {
            return;
        }
        
        String sql = "INSERT INTO user_preferred_causes (user_id, cause) VALUES (?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            for (String cause : user.getPreferredCauses()) {
                stmt.setLong(1, user.getUserId());
                stmt.setString(2, cause);
                stmt.executeUpdate();
            }
        }
    }

    /**
     * Retrieves preferred causes for a user.
     *
     * @param userId the ID of the user
     * @return list of preferred causes
     * @throws SQLException if database operation fails
     */
    private List<String> getPreferredCauses(Long userId) throws SQLException {
        List<String> causes = new ArrayList<>();
        String sql = "SELECT cause FROM user_preferred_causes WHERE user_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, userId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    causes.add(rs.getString("cause"));
                }
            }
        }
        
        return causes;
    }

    /**
     * Updates preferred causes for a user.
     *
     * @param user the user whose preferred causes to update
     * @throws SQLException if database operation fails
     */
    private void updatePreferredCauses(User user) throws SQLException {
        deletePreferredCauses(user.getUserId());
        savePreferredCauses(user);
    }

    /**
     * Deletes all preferred causes for a user.
     *
     * @param userId the ID of the user
     * @throws SQLException if database operation fails
     */
    private void deletePreferredCauses(Long userId) throws SQLException {
        String sql = "DELETE FROM user_preferred_causes WHERE user_id = ?";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, userId);
            stmt.executeUpdate();
        }
    }
}
