package no.ntnu.idatx1005.hmh.dao;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Singleton class for managing database connections.
 * Implements connection pooling and ensures single database connection instance.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class DatabaseConnection {
    private static final String DATABASE_URL = "jdbc:sqlite:hmh_database.db";
    private static DatabaseConnection instance;
    private Connection connection;

    /**
     * Private constructor to prevent instantiation.
     * Initializes database connection and schema.
     */
    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(DATABASE_URL);
            initializeDatabase();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to establish database connection", e);
        }
    }

    /**
     * Gets the singleton instance of DatabaseConnection.
     *
     * @return the DatabaseConnection instance
     */
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    /**
     * Gets the database connection.
     *
     * @return the database connection
     * @throws SQLException if connection is closed or invalid
     */
    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(DATABASE_URL);
        }
        return connection;
    }

    /**
     * Initializes the database schema by executing the schema.sql file.
     */
    private void initializeDatabase() {
        try (InputStream inputStream = getClass().getClassLoader()
                .getResourceAsStream("database/schema.sql")) {
            
            if (inputStream == null) {
                System.err.println("schema.sql not found in resources. Database may not be initialized.");
                return;
            }

            Scanner scanner = new Scanner(inputStream).useDelimiter(";");
            Statement statement = connection.createStatement();

            while (scanner.hasNext()) {
                String sql = scanner.next().trim();
                if (!sql.isEmpty()) {
                    statement.execute(sql);
                }
            }
            
            scanner.close();
            statement.close();
            
        } catch (SQLException | IOException e) {
            System.err.println("Error initializing database: " + e.getMessage());
        }
    }

    /**
     * Closes the database connection.
     */
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing database connection: " + e.getMessage());
        }
    }
}
