package EmployeeObjects;

import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;

/**
 *
 * @author lhartman2
 */
public final class CommissionEmployee extends Employee {
    
    private double sales;
    private double rate;
    
    public CommissionEmployee(String fn, String ln, int en, String dept, String job, double r)
    {
        super(fn, ln, en, dept, job, EmployeeType.COMMISSION);
        rate = r;
        sales = 0.0;
    }
    
    public void increaseSales()
    {
        sales += 100.0;
    }
    
    public void increaseSales(double s)
    {
        sales += s;
    }
    
    @Override
    public double calculateWeeklyPay()
    {
        return rate * sales;
    }
    
    @Override
    public void annualRaise()
    {
       rate += .002;
    }
    
    @Override
    public double holidayBonus()
    {
        return 0;
    }
    
    @Override
    public void resetWeek()
    {
        sales = 0.0;
    }

    @Override
    public void setPay(double pay)
    {
        rate = pay;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nRate: " + percent.format(rate) +"\nSales: " + currency.format(sales);
    }
}

