package no.ntnu.idatx1005.hmh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.ntnu.idatx1005.hmh.dao.DatabaseConnection;

/**
 * Main application class for Help Me Help (HmH).
 * Initializes the JavaFX application and sets up the primary stage.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class HmHApp extends Application {

    private static final String APP_TITLE = "Help Me Help - Donation Manager";
    private static final int WINDOW_WIDTH = 1200;
    private static final int WINDOW_HEIGHT = 800;

    /**
     * Starts the JavaFX application.
     *
     * @param primaryStage the primary stage for this application
     * @throws Exception if there is an error loading the FXML
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize database connection
        initializeDatabase();

        // Load the main view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
        Parent root = loader.load();

        // Configure the scene
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        scene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

        // Configure the stage
        primaryStage.setTitle(APP_TITLE);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        
        // Show the stage
        primaryStage.show();
    }

    /**
     * Initializes the database connection and schema.
     */
    private void initializeDatabase() {
        try {
            DatabaseConnection.getInstance();
            System.out.println("Database initialized successfully");
        } catch (Exception e) {
            System.err.println("Error initializing database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Cleanup method called when the application stops.
     *
     * @throws Exception if there is an error during cleanup
     */
    @Override
    public void stop() throws Exception {
        // Close database connection
        DatabaseConnection.getInstance().closeConnection();
        System.out.println("Application shutting down...");
        super.stop();
    }

    /**
     * Main entry point for the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
