package EmployeeObjects;


import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;

/**
 *
 * @author lhartman2
 */
public final class SalaryEmployee extends Employee {
    
    private double salary;
    
    public SalaryEmployee(String fn, String ln, int en, String dept, String job, double s)
    {
        super(fn, ln, en, dept, job, EmployeeType.SALARY);
        salary = s;
    }
    
    @Override
    public double calculateWeeklyPay()
    {
        double pay = (double)Math.round(salary/52*100)/100;
        return pay;
    }
    
    @Override
    public void annualRaise()
    {
       salary += salary * .0625;
    }

    public double getSalary() {
        return salary;
    }
    
    @Override
    public double holidayBonus()
    {
        return salary * .03365;
    }
    
    @Override
    public void resetWeek()
    {
        // nothing to reset
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nSalary: " + currency.format(salary);
    }

    @Override
    public void setPay(double pay)
    {
        salary = pay;
    }
}
