/**
 * Name: James J. Kim
 * Title: Assignment3.java
 * Author: James J. Kim
 * Description: Determine the GCD of two integers
 * Time Spent: 20 Minutes
 * Date 10/30/2017
 */

/**
 * PART 1 Answers
 *
 * 1a. 10 9 8 7 6 5 4 3 2
 * 2a. 5 15
 * 3.
 * for (int i = str.length() - 1; i >= 0; i--) {
        System.out.print(str.charAt(i));
    }
 *
 *
 */
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args){

        // Instantiate a scanner object
        Scanner inputScanner = new Scanner(System.in);

        // ivar to hold the user inputs
        int firstNumber;
        int secondNumber;

        // flag to determine if firstNumber is equal to secondNumber
        boolean gcdFound = false;

        System.out.print("Enter the first integer: ");
        firstNumber = inputScanner.nextInt();

        System.out.print("Enter the second integer: ");
        secondNumber = inputScanner.nextInt();

        // Output string
        String output = "GCD of " + firstNumber + " and " + secondNumber + " is ";

        // Run while first and second number are not equal
        while (firstNumber != secondNumber) {

            // If first number is greater, then subtract and store the different in the first number
            if (firstNumber >= secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }

        // Append the gcd to the output string
        System.out.println(output + firstNumber);

    }
}
