package no.ntnu.idatx1005.hmh.controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

/**
 * Controller for the main application view.
 * Handles navigation between different views and main application functionality.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class MainController {

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private MenuBar menuBar;

    /**
     * Initializes the controller.
     * Called automatically after FXML loading.
     */
    @FXML
    public void initialize() {
        // Initialize main view components
        setupMenu();
    }

    /**
     * Sets up the menu bar with navigation options.
     */
    private void setupMenu() {
        // TODO: Implement menu setup
        // Menu items will include:
        // - File (New, Open, Save, Exit)
        // - View (Profile, Organizations, Donations)
        // - Help (About, Documentation)
    }

    /**
     * Navigates to the user profile view.
     */
    @FXML
    public void showUserProfile() {
        // TODO: Load UserProfileView.fxml
        System.out.println("Navigating to User Profile");
    }

    /**
     * Navigates to the organization list view.
     */
    @FXML
    public void showOrganizationList() {
        // TODO: Load OrganizationListView.fxml
        System.out.println("Navigating to Organization List");
    }

    /**
     * Navigates to the donation view.
     */
    @FXML
    public void showDonationView() {
        // TODO: Load DonationView.fxml
        System.out.println("Navigating to Donation View");
    }

    /**
     * Exits the application.
     */
    @FXML
    public void exitApplication() {
        System.exit(0);
    }

    /**
     * Shows the about dialog.
     */
    @FXML
    public void showAbout() {
        // TODO: Implement about dialog
        System.out.println("Help Me Help (HmH) Application v1.0.0");
        System.out.println("IDATx1005 System Development Project");
    }
}
