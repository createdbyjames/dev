/**
 * Name: James J. Kim
 * Title: Assignment1.java
 * Author: James J. Kim
 * Description: Calculate the tip to leave at the restaurant
 * Time Spent: 20 Minutes
 * Date 10/14/2017
 */

/**
 * Part 1
 * a. Compile Failure -  Class name mismatch to the filename.
 * b. Compile Failure - Tt doesn't know where the beginning of the string expression is.
 * c. Compile Failure - Java is expecting a ';' which indicates end of a statement
 * d. Compile Failure - Expecting an end of the file closing brace but now causing mismatch
 * e. Compile Failure - Java is unable to utilize a undeclared variable
 *
 * Part 2
 * 1a. mystery has a value 5
 * 1b. mystery has a value 3
 * 1c. mystery has a value 4
 *
 * 2a. 0
 * 2b. 3.333333
 * 2c. 2
 * 2d. 4.3
 * 2e. 1.6
 * 2f. 1
 * 2g. 1
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment1 {

    public static void main(String[] args) {

        double totalBill;       // Total bill amount the user will input
        double finalBill;       // Final bill which includes the tip
        double tipAmount;       // Percentage of tip user wishes to leave

        // Instantiate a Scanner class to get user's input
        Scanner input = new Scanner(System.in);

        // Instantiate a NumberFormat object to use to format the output
        NumberFormat billFormat = NumberFormat.getCurrencyInstance();

        // Ask for the total amount of the bill
        System.out.print("Enter the bill amount: $");

        // Assigned user's input into totalBill
        totalBill = input.nextDouble();

        // Ask for the percentage user wishes to tip
        System.out.print("What percentage would you like to tip: ");

        // Calculate the total tip amount
        tipAmount = (totalBill * ((double)input.nextInt() / 100));

        // Display the total tip amount
        System.out.println("Tip Amount: " + billFormat.format(tipAmount));

        // Calculate the total bill including the percentage of tip
        finalBill = tipAmount + totalBill;

        // Display the total amount including the tip
        System.out.print("Total amount with tip: " + billFormat.format(finalBill));

    }
}
