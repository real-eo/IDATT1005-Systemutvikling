package no.ntnu.idatx1005.hmh.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for DatabaseConnection.
 * Tests database connection and initialization.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
@DisplayName("DatabaseConnection Tests")
class DatabaseConnectionTest {

    @Test
    @DisplayName("Test singleton instance creation")
    void testSingletonInstance() {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        DatabaseConnection instance2 = DatabaseConnection.getInstance();
        
        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2, "Should return the same instance");
    }

    @Test
    @DisplayName("Test database connection is not null")
    void testGetConnection() {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        
        assertDoesNotThrow(() -> {
            assertNotNull(dbConnection.getConnection());
        });
    }

    @Test
    @DisplayName("Test connection can be closed without errors")
    void testCloseConnection() {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        
        assertDoesNotThrow(() -> {
            dbConnection.closeConnection();
        });
    }
}
