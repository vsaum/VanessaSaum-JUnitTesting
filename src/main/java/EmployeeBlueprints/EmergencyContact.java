package EmployeeBlueprints;

/**
 * This class holds the emergency contact information for an employee
 *
 * @author Lucas Hartman
 * @version 1.0.0
 */
public class EmergencyContact {

    private String name;
    private String relationship;
    private String phone;

    /**
     * Main constructor
     * @param n name of the contact
     * @param r relationship to the employee
     * @param p the phone number of the contact
     */
    public EmergencyContact(String n, String r, String p)
    {
        name = n;
        phone = p;
        relationship = r;
    }

    /**
     * Returns the name of the contact
     * @return a String for the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the phone number of the contact
     * @return A String for the phone number
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Returns the relationship between the contact and the employee
     * @return A String for the relationship
     */
    public String getRelationship()
    {
        return relationship;
    }

    /**
     * Updates the name of the contact
     * @param n String for the new name
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Updates the phone number of the contact
     * @param p String for the new phone number
     */
    public void setPhone(String p)
    {
        phone = p;
    }

    /**
     * Updates the relationship between the employee and contact
     * @param r String for the new relationship
     */
    public void setRelationship(String r)
    {
        relationship = r;
    }

    /**
     * This will print out a format of the contact.
     */
    public void printContact()
    {
        System.out.println(this);
    }

    /**
     * Formatted print out of the object
     * @return String of the Emergency Contact
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nRelationship: " + relationship + "\nPhone Number: " + phone;
    }

}
