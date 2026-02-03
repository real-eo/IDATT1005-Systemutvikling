package no.ntnu.idatx1005.hmh.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import no.ntnu.idatx1005.hmh.model.User;
import no.ntnu.idatx1005.hmh.service.UserService;

import java.sql.SQLException;

/**
 * Controller for the user profile view.
 * Handles user profile display and editing functionality.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class UserProfileController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextArea preferredCausesArea;

    @FXML
    private Label statusLabel;

    @FXML
    private Button saveButton;

    @FXML
    private Button cancelButton;

    private UserService userService;
    private User currentUser;

    /**
     * Initializes the controller.
     * Called automatically after FXML loading.
     */
    @FXML
    public void initialize() {
        userService = new UserService();
        // TODO: Load current user from session/context
    }

    /**
     * Loads user data into the form fields.
     *
     * @param user the user to display
     */
    public void loadUser(User user) {
        this.currentUser = user;
        if (user != null) {
            nameField.setText(user.getName());
            emailField.setText(user.getEmail());
            phoneField.setText(user.getPhoneNumber());
            if (user.getPreferredCauses() != null) {
                preferredCausesArea.setText(String.join(", ", user.getPreferredCauses()));
            }
        }
    }

    /**
     * Handles the save button action.
     * Saves or updates user profile.
     */
    @FXML
    public void handleSave() {
        try {
            if (currentUser == null) {
                currentUser = new User();
            }

            currentUser.setName(nameField.getText());
            currentUser.setEmail(emailField.getText());
            currentUser.setPhoneNumber(phoneField.getText());

            if (currentUser.getUserId() == null) {
                userService.createUser(currentUser);
                statusLabel.setText("User profile created successfully!");
            } else {
                userService.updateUser(currentUser);
                statusLabel.setText("User profile updated successfully!");
            }
        } catch (SQLException e) {
            statusLabel.setText("Error saving user: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            statusLabel.setText("Validation error: " + e.getMessage());
        }
    }

    /**
     * Handles the cancel button action.
     * Clears the form or returns to previous view.
     */
    @FXML
    public void handleCancel() {
        // TODO: Navigate back to main view or clear form
        clearForm();
    }

    /**
     * Clears all form fields.
     */
    private void clearForm() {
        nameField.clear();
        emailField.clear();
        phoneField.clear();
        preferredCausesArea.clear();
        statusLabel.setText("");
    }
}
