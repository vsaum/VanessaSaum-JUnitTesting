package EmployeeBlueprints;
// tester employee

import java.util.ArrayList;

public abstract class Employee implements Printable {
    private String firstName;
    private String lastName;
    private int employeeNum;
    private String department;
    private String jobTitle;
    private EmployeeType employeeType;

    private ArrayList<EmergencyContact> emergencyContacts;
    
    public Employee(String fn, String ln, int en, String dept, String job, EmployeeType et)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = dept;
        jobTitle = job;
        emergencyContacts = new ArrayList<EmergencyContact>();
        Printable.percent.setMaximumFractionDigits(3);
        employeeType = et;
    }
    
    public Employee(String fn, String ln, int en, EmployeeType et)
    {
        firstName = fn;
        lastName = ln;
        employeeNum = en;
        department = "";
        jobTitle = "";
        emergencyContacts = new ArrayList<EmergencyContact>();
        Printable.percent.setMaximumFractionDigits(3);
        employeeType = et;
    }

    public Employee(Employee e)
    {
        firstName = e.getFirstName();
        lastName = e.getLastName();
        employeeNum = e.getEmployeeNumber();
        department = e.getDepartment();
        jobTitle = e.getJobTitle();
        emergencyContacts = new ArrayList<EmergencyContact>();
        employeeType = e.getEmployeeType();
    }
    
    // default
    public Employee()
    {
        firstName = "";
        lastName = "";
        employeeNum = 0;
        department = "";
        jobTitle = "";
        emergencyContacts = new ArrayList<EmergencyContact>();
        Printable.percent.setMaximumFractionDigits(3);
        employeeType = EmployeeType.HOURLY;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType et)
    {
        employeeType = et;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeNumber() {
        return employeeNum;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setEmployeeNumber(int empNum)
    {
        employeeNum = empNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    
    public abstract double calculateWeeklyPay();

    public abstract void resetWeek();

    public abstract void annualRaise();

    public abstract double holidayBonus();

    public abstract void setPay(double pay);

    public static String currencyFormat(double amt)
    {
        return Printable.currency.format(amt);
    }

    @Override
    public String toString()
    {
        return "Name: " + firstName +" " + lastName + "\nID: " + employeeNum +
                "\nDepartment: " + department + "\nTitle: " + jobTitle +
                "\nType: " + employeeType.toString();
    }

    @Override
    public void print()
    {
        System.out.println(toString());
    }

    public void printEmergencyContacts()
    {
        System.out.println("**** Emergency Contacts ****\n");
        for (int i = 0; i < emergencyContacts.size(); i++)
        {
            System.out.println("**** Contact "+ (i+1) + "****");
            emergencyContacts.get(i).printContact();
            System.out.println(); // add a space between each
        }
    }

    public void clearContacts()
    {
        emergencyContacts.clear();
    }

    public void addNewContact(EmergencyContact contact)
    {
        emergencyContacts.add(contact);
    }

    public ArrayList<EmergencyContact> getEmergencyContactList() {
        return emergencyContacts;
    }

    public boolean removeContact(EmergencyContact contact)
    {
        if (emergencyContacts.contains(contact))
        {
            emergencyContacts.remove(contact);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean removeContact(int index)
    {
        if (emergencyContacts.size() > index && emergencyContacts.size() > 0)
        {
            emergencyContacts.remove(index);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean equals(Object obj2)
    {
        if (obj2 instanceof Employee e2)
        {
            if (employeeNum == e2.getEmployeeNumber())
            {
                return true;
            }
        }
        return false;
    }

}
