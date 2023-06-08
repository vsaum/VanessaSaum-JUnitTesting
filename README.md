![Assignment Banner](/assets/images/AssingBanner.PNG)
![Assignment icon](/assets/images/Assignment.png)
For this assignment you are going to practice your version control skills by branching a repo and writing some JUnit tests to make sure the project is coded correctly.

![Direction icon](/assets/images/Directions.png) 
# Directions
## To Get Started:
1. Install Git and GitHub Desktop App.
2. Set your name and MCC email address as the name and email for Git
3. Create a GitHub Account using your MCC email
4. Clone the GitHub Repository: https://github.com/lhartman2/INFO1541Assignment2Links to an external site. 
5. This can be done either through GitHub Desktop or you can do it in IntelliJ
6. Open the project in IntelliJ IDEA
  * Take a look at the project and see what every file does and how it is broken up into their respective packages.
  * App
    * Contains the main runner file EmployeeSystem.java that is a simple console based program for the system.
  * EmployeeBlueprints
    * Contains the objects that hold information on each Employee, Emergency Contacts for the employee, Enum type for each Employee and a simple Printable interface
  * EmployeeObjects
    * Contains three objects for different types of employee, hourly, salary and commission. These are the main files here that we will write JUnit tests on.

## Part 1: Branch Your Project
To start out you are working in the DONT-WORK-HERE branch which is the main protected branch. For each student's work you need to create your own branch. Again you can do this within the GitHub app or in IntelliJ. 

Create the branch titled:  YOURNAME-JUnitTesting (where YOURNAME should be replaced with your name)

*Note: if I don't know who you are, you won't get a grade as I won't see your branch.*


## Part 2: Create JUnit's for each Employee Type

We now need to test each of our three employees to make sure they are coded and work correctly. Make sure each method you create has a super specific name to what you are testing.

### Hourly Employee
Create a new java file inside the **test->java** folder called **HourlyEmployeeTest.java**

Use the following code to set up a fake employee to then test with:
>     HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

Create methods to test the following:
* **increaseHours(double h)**
  * This method makes sure the value sent ('h') is a positive number. We don't want to add negative numbers. Do several method calls adding hours both positive and negative then use the getter for testing the hoursWorked value.
* **annualRaise()**
  * This method increases the wage of the employee by 5%. It does this by taking wage * .05, rounding to two decimals and adding to the wage of the employee. Check to make sure that it gives the correct raise. The employee should be paid 34.49 after the annual raise method is called.
* **calculateWeeklyPay()**
  * This method calculates the weekly pay for the employee. BUT if the hours they have worked is over 40 then they get overtime.
  * Write a method that sends 35 hours to the test employee above. Then when you call the calculateWeeklyPay it should return: 1149.75
  * Write a method that sends 45 hours to the test employee above. Then when you call the calculateWeeklyPay it shoudl return: 1560.38
    * If a number is off, check the caluclation. It should take 40 * pay + (pay *1.5 * (hours-40)). Fix if needed and commit changes.

### Salary Employee
Create a new java file inside the **test->java** folder called **SalaryEmployeeTest.java**

Use the following code to set up a fake employee to then test with:
>     SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);

Create methods to test the following:
* **calculateWeekleyPay()**
  * This method calculates the weekly pay of a salary employee by taking their salary dividing it by 52. Create a testing method that calls this and makes sure that the amount the Steve get's paid should be: 1237.02 - This is a rounded amount that should be exact, if not fix the code as part of your commits. Use Math.round() to help.
* **holidayBonus()**
  * This method calculates the holiday bonus by giving the employee 3.365% of their salary. Create a test method that calls this and makes sure that the amount for the bonus is: 2164.54 exactly. This is a rounded amount that should be exact, if not fix the code as part of your commits. Use Math.round() to help.

### Commission Employee

Create a new java file inside the **test->java** folder called **CommissionEmployeeTest.java**

Use the following code to set up a fake employee to then test with:
>     CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

Create methods to test the following:
* **increaseSales(double s)**
  * This method makes sure that the value sent ('s') is a positive number before adding to the employee's sales. Write a test method that adds positive and negative amounts to an employee. Then see what the sales values are. It should be what positive values were sent.
    * If the test fails then take a look at this method in the CommissionEmployee.java and add some conditions to make sure 's' is positive before adding to the sales field. Commit any fixes.
* **holidayBonus()**
  * This method for commission employees should return 0. These employees don't get a holiday bonus, make sure that value is correct.
* **annualRaise()**
  * This method adds .002 to the rate field of the employee. Call this method twice and then use the getter method to check that the rate for the test employee is: .0305

## Submission
There is no submission here in Canvas but instead you need to make commits and push updates out to the branch. I will be grading via the repository that I have. For full points you should make sure to have several commits not just one at the end. The idea here is to show you understand some project development. Ideally you have at a minimum of three commits, one for each JUnit test you create per employee. You can definitely have more, BUT don't go overboard with commits and pushes(for example don't commit after each new test method you make).





