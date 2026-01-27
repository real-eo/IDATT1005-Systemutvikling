package no.ntnu.idatx1005.hmh.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Organization model.
 * Tests getters, setters, equals, hashCode, and toString methods.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
@DisplayName("Organization Model Tests")
class OrganizationTest {

    private Organization organization;

    @BeforeEach
    void setUp() {
        organization = new Organization();
    }

    @Test
    @DisplayName("Test Organization default constructor")
    void testDefaultConstructor() {
        assertNotNull(organization);
        assertFalse(organization.isVerified());
    }

    @Test
    @DisplayName("Test Organization parameterized constructor")
    void testParameterizedConstructor() {
        Organization org = new Organization(1L, "Red Cross", "123456789", 
                                           "Humanitarian org", "Health", 
                                           "http://redcross.org", true, "APPROVED");
        
        assertEquals(1L, org.getOrganizationId());
        assertEquals("Red Cross", org.getName());
        assertEquals("123456789", org.getRegistrationNumber());
        assertTrue(org.isVerified());
    }

    @Test
    @DisplayName("Test getter and setter for organizationId")
    void testOrganizationIdGetterSetter() {
        organization.setOrganizationId(1L);
        assertEquals(1L, organization.getOrganizationId());
    }

    @Test
    @DisplayName("Test getter and setter for name")
    void testNameGetterSetter() {
        organization.setName("Save the Children");
        assertEquals("Save the Children", organization.getName());
    }

    @Test
    @DisplayName("Test getter and setter for verified status")
    void testVerifiedGetterSetter() {
        organization.setVerified(true);
        assertTrue(organization.isVerified());
    }

    @Test
    @DisplayName("Test equals method")
    void testEquals() {
        Organization org1 = new Organization();
        org1.setOrganizationId(1L);
        org1.setRegistrationNumber("123456");

        Organization org2 = new Organization();
        org2.setOrganizationId(1L);
        org2.setRegistrationNumber("123456");

        assertEquals(org1, org2);
    }

    @Test
    @DisplayName("Test hashCode method")
    void testHashCode() {
        Organization org1 = new Organization();
        org1.setOrganizationId(1L);

        Organization org2 = new Organization();
        org2.setOrganizationId(1L);

        assertEquals(org1.hashCode(), org2.hashCode());
    }

    @Test
    @DisplayName("Test toString method")
    void testToString() {
        organization.setOrganizationId(1L);
        organization.setName("WWF");
        String result = organization.toString();
        
        assertTrue(result.contains("organizationId=1"));
        assertTrue(result.contains("name='WWF'"));
    }
}
