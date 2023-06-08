package EmployeeBlueprints;

import java.text.NumberFormat;

/**
 * Interface to help with printing out objects. Provides number formatters as well.
 * @author Lucas Hartman
 * @version 1.0.0
 */
public interface Printable {
    /**
    Formatter for currency
     */
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    /**
     * Formatter for percentages
     */
    NumberFormat percent = NumberFormat.getPercentInstance();

    /**
     * Required method for printing out on objects.
     */
    void print();
}
