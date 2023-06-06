package EmployeeBlueprints;

public enum EmployeeType {
    HOURLY,
    SALARY,
    COMMISSION;

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
