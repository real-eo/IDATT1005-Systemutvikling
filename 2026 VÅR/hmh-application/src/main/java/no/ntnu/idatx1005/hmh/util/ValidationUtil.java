package no.ntnu.idatx1005.hmh.util;

import java.util.regex.Pattern;

/**
 * Utility class for validation operations.
 * Provides methods to validate common data formats.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class ValidationUtil {

    private static final Pattern EMAIL_PATTERN = 
        Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    
    private static final Pattern PHONE_PATTERN = 
        Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{8,15}$");

    /**
     * Private constructor to prevent instantiation.
     */
    private ValidationUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Validates an email address format.
     *
     * @param email the email to validate
     * @return true if email format is valid
     */
    public static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }

    /**
     * Validates a phone number format.
     * Accepts international format with optional country code.
     *
     * @param phoneNumber the phone number to validate
     * @return true if phone number format is valid
     */
    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            return false;
        }
        return PHONE_PATTERN.matcher(phoneNumber).matches();
    }

    /**
     * Validates that a string is not null or empty.
     *
     * @param value the string to validate
     * @return true if string is not null and not empty
     */
    public static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    /**
     * Validates that a string has a minimum length.
     *
     * @param value the string to validate
     * @param minLength the minimum required length
     * @return true if string meets minimum length requirement
     */
    public static boolean hasMinLength(String value, int minLength) {
        return value != null && value.length() >= minLength;
    }

    /**
     * Validates that a string does not exceed maximum length.
     *
     * @param value the string to validate
     * @param maxLength the maximum allowed length
     * @return true if string does not exceed maximum length
     */
    public static boolean hasMaxLength(String value, int maxLength) {
        return value == null || value.length() <= maxLength;
    }

    /**
     * Validates a URL format.
     *
     * @param url the URL to validate
     * @return true if URL format is valid
     */
    public static boolean isValidUrl(String url) {
        if (url == null || url.trim().isEmpty()) {
            return false;
        }
        try {
            new java.net.URL(url);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Validates that a number is positive.
     *
     * @param value the number to validate
     * @return true if number is positive
     */
    public static boolean isPositive(Number value) {
        if (value == null) {
            return false;
        }
        return value.doubleValue() > 0;
    }

    /**
     * Validates that a number is non-negative.
     *
     * @param value the number to validate
     * @return true if number is non-negative
     */
    public static boolean isNonNegative(Number value) {
        if (value == null) {
            return false;
        }
        return value.doubleValue() >= 0;
    }
}
