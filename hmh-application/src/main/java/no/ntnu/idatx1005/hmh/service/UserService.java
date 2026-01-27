package no.ntnu.idatx1005.hmh.service;

import no.ntnu.idatx1005.hmh.dao.UserDAO;
import no.ntnu.idatx1005.hmh.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Service class for User-related business logic.
 * Acts as an intermediary between controllers and UserDAO.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class UserService {
    private final UserDAO userDAO;

    /**
     * Constructs a UserService.
     */
    public UserService() {
        this.userDAO = new UserDAO();
    }

    /**
     * Creates a new user after validation.
     *
     * @param user the user to create
     * @return the created user
     * @throws IllegalArgumentException if user data is invalid
     * @throws SQLException if database operation fails
     */
    public User createUser(User user) throws SQLException {
        validateUser(user);
        return userDAO.create(user);
    }

    /**
     * Retrieves a user by ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the user, or null if not found
     * @throws SQLException if database operation fails
     */
    public User getUser(Long userId) throws SQLException {
        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException("User ID must be a positive number");
        }
        return userDAO.read(userId);
    }

    /**
     * Updates an existing user after validation.
     *
     * @param user the user to update
     * @return true if update was successful
     * @throws IllegalArgumentException if user data is invalid
     * @throws SQLException if database operation fails
     */
    public boolean updateUser(User user) throws SQLException {
        validateUser(user);
        if (user.getUserId() == null) {
            throw new IllegalArgumentException("User ID cannot be null for update");
        }
        return userDAO.update(user);
    }

    /**
     * Deletes a user by ID.
     *
     * @param userId the ID of the user to delete
     * @return true if deletion was successful
     * @throws SQLException if database operation fails
     */
    public boolean deleteUser(Long userId) throws SQLException {
        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException("User ID must be a positive number");
        }
        return userDAO.delete(userId);
    }

    /**
     * Retrieves all users.
     *
     * @return list of all users
     * @throws SQLException if database operation fails
     */
    public List<User> getAllUsers() throws SQLException {
        return userDAO.findAll();
    }

    /**
     * Validates user data.
     *
     * @param user the user to validate
     * @throws IllegalArgumentException if user data is invalid
     */
    private void validateUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("User name cannot be empty");
        }
        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("User email cannot be empty");
        }
        if (!isValidEmail(user.getEmail())) {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    /**
     * Validates email format.
     *
     * @param email the email to validate
     * @return true if email format is valid
     */
    private boolean isValidEmail(String email) {
        // Basic email validation
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
}
