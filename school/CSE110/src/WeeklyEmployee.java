/**
 * Implement a class named WeeklyEmployee. Each instance of WeeklyEmployee must keep track of the
 *
 * employee's name, the
 * hourly rate of pay, and the
 * number of hours worked during the current week.
 *
 * Each instance of WeeklyEmployee must be able to compute its
 * own gross pay, which is defined as (hours worked * hourly rate of pay).
 *
 * A programmer must be able to set the hours worked each week since this changes from week to week.
 * Because BogusBurgers' time clock measures hours worked in tenths of an hour, hours worked must have a fractional part (could make this a double).

 Implement the constructor,
 a toString method to show the name and dollars per hour,
 a getName method to return the name,
 a getGrossPay method that calculates and returns the gross pay, and a
 setHours method to change the hours worked.

 The following Java code must generate the output below.

 ------------------------------------CODE------------------------------------
 // This employee worked 30.0 hours at $10.00 per hour
 WeeklyEmployee anEmp = new WeeklyEmployee( "Bob Berger", 30.0, 10.00 );

 System.out.println(anEmp.toString());

 System.out.println(anEmp.getName() + " grossed " + anEmp.getGrossPay());

 anEmp.setHours( 40.0 );

 System.out.println(anEmp.getName() + " grossed " + anEmp.getGrossPay());

 ------------------------------------OUTPUT------------------------------------
 Bob Berger: $10.00
 Bob Berger grossed 300.0
 Bob Berger grossed 400.0
 _________________________________________________________________________

 Steps to complete the class WeeklyEmployee  (all that is required for the quiz)
 x Step 1: Make the WeeklyEmployee class
 x Step 2: Declare 3 instance variables for name, rate of pay, and hours worked
 x Step 3: Declare the constructor with 3 parameters to initialize the instance variables
 x Step 4: Declare the method toString that returns a String with WeeklyEmployee name, and hourly rate of pay
 x Step 5: Write the accessor method: getName() that returns the name
 x Step 6: Write the getGrossPay that computes and returns the pay for each Weekly Employee by multiplying the rate times hours worked
 x Step 7: Write the mutator method setHours that takes the number of hours worked as a double

 */

public class WeeklyEmployee {

    private String name;
    private double rateOfPay;
    private double hoursWorked;

    public WeeklyEmployee(String name, double hoursWorked, double rateOfPay){
        this.name = name;
        this.rateOfPay = rateOfPay;
        this.hoursWorked = hoursWorked;
    }

    // acesssors
    public String getName() {
        return this.name;
    }

    public double getRateOfPay() {
        return this.rateOfPay;
    }

    // return the grossPay
    public double getGrossPay() {

        double grossPay = this.rateOfPay * this.hoursWorked;

        return grossPay;
    }

    // mutator to set the number of hours worked
    public void setHours(double hours) {
        this.hoursWorked = hours;
    }

    // Return description of the object
    public String toString() {

        // format the string
        String output = this.getName() + ": " + this.getRateOfPay();

        return output;
    }
}
