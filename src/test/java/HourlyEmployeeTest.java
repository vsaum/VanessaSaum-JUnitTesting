import EmployeeObjects.HourlyEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HourlyEmployeeTest {

    @Test
    public void testIncreaseHours_positiveValue() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(5);
        assertEquals(5, emp.getHoursWorked(), 0);
    }

    @Test
    public void testIncreaseHours_negativeValue() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(-5);
        assertEquals(0, emp.getHoursWorked(), 0);
    }

    @Test
    public void testAnnualRaise() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        assertEquals(34.49, emp.getWage(), 0.01);
    }

    @Test
    public void testCalculateWeeklyPay_regularHours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay(), 0.01);
    }

    @Test
    public void testCalculateWeeklyPay_overtimeHours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45);
        assertEquals(1560.38, emp.calculateWeeklyPay(), 0.01);
    }
}

