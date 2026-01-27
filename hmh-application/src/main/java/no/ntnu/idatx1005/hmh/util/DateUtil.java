package no.ntnu.idatx1005.hmh.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Utility class for date and time operations.
 * Provides methods for formatting, parsing, and calculating dates.
 * 
 * @author HmH Development Team
 * @version 1.0.0
 */
public class DateUtil {

    private static final DateTimeFormatter DEFAULT_FORMATTER = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    private static final DateTimeFormatter DATE_FORMATTER = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    private static final DateTimeFormatter DISPLAY_FORMATTER = 
        DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    /**
     * Private constructor to prevent instantiation.
     */
    private DateUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Formats a LocalDateTime to default format string (yyyy-MM-dd HH:mm:ss).
     *
     * @param dateTime the date-time to format
     * @return formatted date-time string
     */
    public static String formatDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        return dateTime.format(DEFAULT_FORMATTER);
    }

    /**
     * Formats a LocalDateTime to display format (dd.MM.yyyy HH:mm).
     *
     * @param dateTime the date-time to format
     * @return formatted date-time string for display
     */
    public static String formatForDisplay(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        return dateTime.format(DISPLAY_FORMATTER);
    }

    /**
     * Formats a LocalDateTime to date only (yyyy-MM-dd).
     *
     * @param dateTime the date-time to format
     * @return formatted date string
     */
    public static String formatDate(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        return dateTime.format(DATE_FORMATTER);
    }

    /**
     * Parses a date-time string in default format.
     *
     * @param dateTimeString the string to parse
     * @return LocalDateTime object
     */
    public static LocalDateTime parseDateTime(String dateTimeString) {
        if (dateTimeString == null || dateTimeString.trim().isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(dateTimeString, DEFAULT_FORMATTER);
    }

    /**
     * Gets the current date-time.
     *
     * @return current LocalDateTime
     */
    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    /**
     * Calculates the number of days between two dates.
     *
     * @param start the start date-time
     * @param end the end date-time
     * @return number of days between dates
     */
    public static long daysBetween(LocalDateTime start, LocalDateTime end) {
        if (start == null || end == null) {
            return 0;
        }
        return ChronoUnit.DAYS.between(start, end);
    }

    /**
     * Calculates the number of hours between two dates.
     *
     * @param start the start date-time
     * @param end the end date-time
     * @return number of hours between dates
     */
    public static long hoursBetween(LocalDateTime start, LocalDateTime end) {
        if (start == null || end == null) {
            return 0;
        }
        return ChronoUnit.HOURS.between(start, end);
    }

    /**
     * Checks if a date is in the past.
     *
     * @param dateTime the date-time to check
     * @return true if date is in the past
     */
    public static boolean isPast(LocalDateTime dateTime) {
        if (dateTime == null) {
            return false;
        }
        return dateTime.isBefore(LocalDateTime.now());
    }

    /**
     * Checks if a date is in the future.
     *
     * @param dateTime the date-time to check
     * @return true if date is in the future
     */
    public static boolean isFuture(LocalDateTime dateTime) {
        if (dateTime == null) {
            return false;
        }
        return dateTime.isAfter(LocalDateTime.now());
    }

    /**
     * Adds days to a date-time.
     *
     * @param dateTime the base date-time
     * @param days the number of days to add
     * @return new LocalDateTime with days added
     */
    public static LocalDateTime addDays(LocalDateTime dateTime, long days) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.plusDays(days);
    }

    /**
     * Subtracts days from a date-time.
     *
     * @param dateTime the base date-time
     * @param days the number of days to subtract
     * @return new LocalDateTime with days subtracted
     */
    public static LocalDateTime subtractDays(LocalDateTime dateTime, long days) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.minusDays(days);
    }
}
