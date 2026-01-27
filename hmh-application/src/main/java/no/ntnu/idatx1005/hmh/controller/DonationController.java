package no.ntnu.idatx1005.hmh.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import no.ntnu.idatx1005.hmh.model.Donation;
import no.ntnu.idatx1005.hmh.model.Organization;
import no.ntnu.idatx1005.hmh.service.DonationService;
import no.ntnu.idatx1005.hmh.service.OrganizationService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

/**
 * Controller for the donation view.
 * Handles donation processing and confirmation.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class DonationController {

    @FXML
    private ComboBox<Organization> organizationComboBox;

    @FXML
    private TextField amountField;

    @FXML
    private TextArea notesArea;

    @FXML
    private Button donateButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Label statusLabel;

    @FXML
    private Label totalDonatedLabel;

    private DonationService donationService;
    private OrganizationService organizationService;
    private Long currentUserId; // TODO: Get from session/context

    /**
     * Initializes the controller.
     * Called automatically after FXML loading.
     */
    @FXML
    public void initialize() {
        donationService = new DonationService();
        organizationService = new OrganizationService();
        
        loadOrganizations();
        setupAmountValidation();
    }

    /**
     * Loads available organizations into the combo box.
     */
    private void loadOrganizations() {
        try {
            List<Organization> organizations = organizationService.getVerifiedOrganizations();
            organizationComboBox.getItems().setAll(organizations);
        } catch (SQLException e) {
            statusLabel.setText("Error loading organizations: " + e.getMessage());
        }
    }

    /**
     * Sets up validation for the amount field.
     */
    private void setupAmountValidation() {
        amountField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*(\\.\\d{0,2})?")) {
                amountField.setText(oldValue);
            }
        });
    }

    /**
     * Handles the donate button action.
     * Processes the donation and saves it to the database.
     */
    @FXML
    public void handleDonate() {
        try {
            Organization selectedOrg = organizationComboBox.getValue();
            if (selectedOrg == null) {
                statusLabel.setText("Please select an organization");
                return;
            }

            String amountText = amountField.getText();
            if (amountText == null || amountText.trim().isEmpty()) {
                statusLabel.setText("Please enter a donation amount");
                return;
            }

            BigDecimal amount = new BigDecimal(amountText);
            if (amount.compareTo(BigDecimal.ZERO) <= 0) {
                statusLabel.setText("Donation amount must be greater than zero");
                return;
            }

            // TODO: Get actual user ID from session/context
            if (currentUserId == null) {
                currentUserId = 1L; // Placeholder
            }

            Donation donation = new Donation();
            donation.setUserId(currentUserId);
            donation.setOrganizationId(selectedOrg.getOrganizationId());
            donation.setAmount(amount);
            donation.setNotes(notesArea.getText());

            donationService.createDonation(donation);
            
            statusLabel.setText("Donation of " + amount + " NOK to " + 
                              selectedOrg.getName() + " successful!");
            
            clearForm();
            updateTotalDonated();

        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid amount format");
        } catch (SQLException e) {
            statusLabel.setText("Error processing donation: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            statusLabel.setText("Validation error: " + e.getMessage());
        }
    }

    /**
     * Handles the cancel button action.
     * Clears the form.
     */
    @FXML
    public void handleCancel() {
        clearForm();
    }

    /**
     * Clears all form fields.
     */
    private void clearForm() {
        organizationComboBox.setValue(null);
        amountField.clear();
        notesArea.clear();
        statusLabel.setText("");
    }

    /**
     * Updates the total donated amount display.
     */
    private void updateTotalDonated() {
        try {
            if (currentUserId != null) {
                BigDecimal total = donationService.calculateTotalDonationsByUser(currentUserId);
                totalDonatedLabel.setText("Total donated: " + total + " NOK");
            }
        } catch (SQLException e) {
            System.err.println("Error calculating total donations: " + e.getMessage());
        }
    }

    /**
     * Sets the current user ID.
     *
     * @param userId the user ID to set
     */
    public void setCurrentUserId(Long userId) {
        this.currentUserId = userId;
        updateTotalDonated();
    }
}
