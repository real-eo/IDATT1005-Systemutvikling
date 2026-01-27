package no.ntnu.idatx1005.hmh.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import no.ntnu.idatx1005.hmh.model.Organization;
import no.ntnu.idatx1005.hmh.service.OrganizationService;

import java.sql.SQLException;
import java.util.List;

/**
 * Controller for the organization list view.
 * Handles displaying and filtering organizations.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class OrganizationListController {

    @FXML
    private TableView<Organization> organizationTable;

    @FXML
    private TableColumn<Organization, String> nameColumn;

    @FXML
    private TableColumn<Organization, String> categoryColumn;

    @FXML
    private TableColumn<Organization, Boolean> verifiedColumn;

    @FXML
    private TextField searchField;

    @FXML
    private ComboBox<String> categoryFilter;

    @FXML
    private CheckBox verifiedOnlyCheckBox;

    @FXML
    private Button refreshButton;

    @FXML
    private Label statusLabel;

    private OrganizationService organizationService;
    private ObservableList<Organization> organizationList;

    /**
     * Initializes the controller.
     * Called automatically after FXML loading.
     */
    @FXML
    public void initialize() {
        organizationService = new OrganizationService();
        organizationList = FXCollections.observableArrayList();
        
        setupTableColumns();
        loadOrganizations();
    }

    /**
     * Sets up table columns with cell value factories.
     */
    private void setupTableColumns() {
        // TODO: Configure cell value factories for table columns
        // nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        // categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        // verifiedColumn.setCellValueFactory(new PropertyValueFactory<>("verified"));
    }

    /**
     * Loads all organizations from the database.
     */
    private void loadOrganizations() {
        try {
            List<Organization> organizations = organizationService.getAllOrganizations();
            organizationList.setAll(organizations);
            organizationTable.setItems(organizationList);
            statusLabel.setText("Loaded " + organizations.size() + " organizations");
        } catch (SQLException e) {
            statusLabel.setText("Error loading organizations: " + e.getMessage());
        }
    }

    /**
     * Handles the refresh button action.
     * Reloads organizations from the database.
     */
    @FXML
    public void handleRefresh() {
        loadOrganizations();
    }

    /**
     * Handles the search field input.
     * Filters organizations based on search text.
     */
    @FXML
    public void handleSearch() {
        String searchText = searchField.getText().toLowerCase();
        if (searchText.isEmpty()) {
            loadOrganizations();
            return;
        }

        try {
            List<Organization> allOrganizations = organizationService.getAllOrganizations();
            List<Organization> filtered = allOrganizations.stream()
                    .filter(org -> org.getName().toLowerCase().contains(searchText) ||
                                   org.getDescription().toLowerCase().contains(searchText))
                    .toList();
            organizationList.setAll(filtered);
            statusLabel.setText("Found " + filtered.size() + " organizations");
        } catch (SQLException e) {
            statusLabel.setText("Error searching organizations: " + e.getMessage());
        }
    }

    /**
     * Handles the category filter selection.
     * Filters organizations by selected category.
     */
    @FXML
    public void handleCategoryFilter() {
        String selectedCategory = categoryFilter.getValue();
        if (selectedCategory == null || selectedCategory.equals("All")) {
            loadOrganizations();
            return;
        }

        try {
            List<Organization> filtered = organizationService.getOrganizationsByCategory(selectedCategory);
            organizationList.setAll(filtered);
            statusLabel.setText("Filtered to " + filtered.size() + " organizations");
        } catch (SQLException e) {
            statusLabel.setText("Error filtering organizations: " + e.getMessage());
        }
    }

    /**
     * Handles the verified only checkbox.
     * Shows only verified organizations when checked.
     */
    @FXML
    public void handleVerifiedFilter() {
        if (verifiedOnlyCheckBox.isSelected()) {
            try {
                List<Organization> verified = organizationService.getVerifiedOrganizations();
                organizationList.setAll(verified);
                statusLabel.setText("Showing " + verified.size() + " verified organizations");
            } catch (SQLException e) {
                statusLabel.setText("Error filtering organizations: " + e.getMessage());
            }
        } else {
            loadOrganizations();
        }
    }

    /**
     * Handles organization selection.
     * Shows details of the selected organization.
     */
    @FXML
    public void handleOrganizationSelection() {
        Organization selected = organizationTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            // TODO: Show organization details or navigate to detail view
            System.out.println("Selected: " + selected.getName());
        }
    }
}
