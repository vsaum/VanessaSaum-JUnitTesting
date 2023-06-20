import EmployeeObjects.SalaryEmployee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryEmployeeTest {

    @Test
    public void testCalculateWeeklyPay() {
        double salary = 64325;
        double expectedWeeklyPay = Math.round(salary / 52 * 100) / 100.0;

        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", salary);
        double actualWeeklyPay = emp.calculateWeeklyPay();

        Assertions.assertEquals(expectedWeeklyPay, actualWeeklyPay);
    }

    @Test
    public void testHolidayBonus() {
        double salary = 64325;
        double expectedBonus = Math.round(salary * 0.03365 * 100) / 100.0;

        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", salary);
        double actualBonus = emp.holidayBonus();

        Assertions.assertEquals(expectedBonus, actualBonus);
    }
}
