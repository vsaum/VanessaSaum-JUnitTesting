package EmployeeBlueprints;

/**
 * Enumeration for the type of employee in the system.
 * @author Lucas Hartman
 * @version 1.0.0
 */
public enum EmployeeType {
    /**
     * Hourly type
     */
    HOURLY,
    /**
     * Salary type
     */
    SALARY,
    /**
     * Commission type
     */
    COMMISSION;

    /**
     * Returns a string of the employee type to print out.
     * @return a String
     */
    @Override
    public String toString()
    {
        String value = switch(this.ordinal()) {
            case 0 -> "Hourly";
            case 1 -> "Salary";
            case 2 -> "Commission";
            default -> "";
        };
        return value;
    }
}
