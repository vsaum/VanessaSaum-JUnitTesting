package EmployeeObjects;

import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;

/**
 *
 * @author lhartman2
 */

public final class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;
    
    public HourlyEmployee(String fn, String ln, int en, String dept, String job, double w)
    {
        super(fn, ln, en, dept, job, EmployeeType.HOURLY);
        wage = w;
        hoursWorked = 0.0;
    }
    
    public void increaseHours()
    {
        hoursWorked += 1;
    }
    
    public void increaseHours(double h)
    {
        hoursWorked += h;
    }
    
    @Override
    public double calculateWeeklyPay()
    {
        double pay = wage * hoursWorked;
        if (hoursWorked > 40)
        {
            pay = wage * 40 + (wage*1.5) * (hoursWorked-40);
        }
        
        return pay;
    }
    
    @Override
    public void annualRaise()
    {
       wage += wage * .05;
    }
    
    @Override
    public double holidayBonus()
    {
        return 40 * wage;
    }
    
    @Override
    public void resetWeek()
    {
        hoursWorked = 0.0;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nWage: " + currency.format(wage) +"\nHours Worked: " + hoursWorked;
    }

    @Override
    public void setPay(double pay)
    {
        wage = pay;
    }
}
