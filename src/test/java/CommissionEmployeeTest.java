import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import EmployeeObjects.CommissionEmployee;

public class CommissionEmployeeTest {

    @Test
    public void testIncreaseSales() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);

        emp.increaseSales(5000);
        Assertions.assertEquals(5000.0, emp.getSales());

        emp.increaseSales(-2000);
        Assertions.assertEquals(5000.0, emp.getSales());

        emp.increaseSales(3000);
        Assertions.assertEquals(8000.0, emp.getSales());
    }

    @Test
    public void testHolidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        double bonus = emp.holidayBonus();
        Assertions.assertEquals(0.0, bonus);
    }

    @Test
    public void testAnnualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.annualRaise();
        emp.annualRaise();
        double rate = emp.getRate();
        Assertions.assertEquals(0.0305, rate);
    }
}
