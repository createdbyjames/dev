/*-------------------------------------------------------------------------
// AUTHOR: James J. Kim
// FILENAME: Lab4.java
// SPECIFICATION: Identify and define user input
// FOR: CSE 110- Lab #4
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

        // Read until user's input is ZERO (0)

        // Instantiate a scanner object to get user input
        Scanner inputScanner = new Scanner(System.in);

        // set of variables to identify different characteristics of inputted numbers
        int largestNumber;
        int smallestNumber;
        int numberOfNumbers = 0;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;
        int sumOfAllNumbers = 0;

        // To capture user input value
        int userInput = 0;

        // Prompt the user with the first initial value
        System.out.println("Enter a series of values (0 to quit) ");

        // Store that value into the input variable
        userInput = inputScanner.nextInt();

        // Since this is the first user input, largest and the small number gets recorded
        largestNumber = userInput;
        smallestNumber = userInput;

        while (userInput != 0) {

            // Determine if the input is the new largest number
            if (userInput > largestNumber) {
                largestNumber = userInput;
            }

            // Determine if the input is the new smallest number
            if (userInput < smallestNumber) {
                smallestNumber = userInput;
            }

            // Check if the number is even or odd and increment
            if (userInput % 2 == 0) {
                numberOfEvenNumbers++;
            } else {
                numberOfOddNumbers++;
            }

            // add to the total number
            sumOfAllNumbers += userInput;

            // Increment the number of input items
            numberOfNumbers++;

            // Ask the user for the next number
            userInput = inputScanner.nextInt();
        }

        // Display the results
        System.out.println("The smallest integer is  " + smallestNumber);
        System.out.println("The largest integer is " + largestNumber);
        System.out.println("Total number of integers entered is " + numberOfNumbers);
        System.out.println("Total even numbers entered is " + numberOfEvenNumbers);
        System.out.println("Total odd numbers entered is " + numberOfOddNumbers);
        System.out.println("The average value is " + (double)sumOfAllNumbers / numberOfNumbers);

    }
}
