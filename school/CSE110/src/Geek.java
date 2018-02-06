/*-------------------------------------------------------------------------
// AUTHOR: James J. Kim
// FILENAME: Geek.java
// SPECIFICATION: Geek Class
// FOR: CSE 110- Geek.java
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/

public class Geek {

    // static variables to hold number of questions asked
    private static int numberOfQuestions = 0;

    // instance variable to hold the name of the geek
    private String name;

    // Constructor
    public Geek(String name, int numQuestions) {

        // assign
        this.name = name;
        this.numberOfQuestions = 0;
    }

    // get the geeks' name
    public String getName() {
        return name;
    }

    // return numberOfQuestions
    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    /**
     It takes two integers and returns a boolean value indicating if the sum of the numbers is even or not
     (this counts as the Geek being asked one more question, so update the appropriate instance variable).
     */
    public boolean isEven(int num1, int num2) {

        // increment the count for total number of questions
        numberOfQuestions++;

        // boolean variable to hold the value
        boolean even = true;

        // add the number
        int sum = num1 + num2;

        // determine if the value is true or false using mod
        even = sum % 2 == 0 ? true : false;

        return even;
    }

    /**
     * public int sum(int num1, int num2) - Takes two integers and returns an int which is the sum of
     all numbers between the two inclusive (include the numbers in the sum) - for full credit this method
     should work even if the two numbers are the same (the sum is just one of the numbers) or if the first
     number is larger than the second. Also, you cannot assume which number will be greater.
     */
    public int sum(int num1, int num2) {

        // increment the count for total number of questions
        numberOfQuestions++;

        // sum of all the numbers
        int sum = 0;

        // determine the larger number to use for starting index
        if (num1 < num2) {

            for (int i = num1; i <= num2; i++) {
                sum += i;
            }

        } else if (num1 > num2) {

            for (int i = num2; i <= num1; i++) {
                sum += i;
            }

        } else {

            // if the number is the same
            sum = num1;
        }

        return sum;
    }

    /**
     * public boolean leapYear(int year) - It takes an integer and returns a boolean value indicating if
     the year is a leap year. A leap year is one with 366 days. A year is a leap year if:
     – it is divisible by 4 (for example, 1980),
     – except that it is not a leap year if it is divisible by 100 (for example 1900);
     – however, it is a leap year if it is divisible by 400 (for example, 2000).
     There were no exceptions before the introduction of the Gregorian calendar on October 15, 1582 (for
     example, 1500 was a leap year). You may NOT use Java’s GregorianCalendar class. (This counts as
     the Geek being asked one more question, so update the appropriate instance variable).
     */

    public boolean leapYear(int year) {

        // increment the count for total number of questions
        numberOfQuestions++;

        // set the initial flag to false;
        boolean isLeapYear = false;

        // determine the leap year
        if (year % 4 == 0) {

            isLeapYear = true;

            if (year % 100 == 0) {
                isLeapYear = true;
            }

            if (year % 400 == 0) {
                isLeapYear = true;
            }

        }
        return isLeapYear;
    }

}
