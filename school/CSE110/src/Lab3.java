/*
 Name: James J. Kim
 Title: Lab3.java
 Description: String comparison.
 Time spent: 20 minutes
 Date: 10/20/2017
*/

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        // Instantiate a scanner object from a Scanner class
        Scanner userInput = new Scanner(System.in);

        // Part 1 of Lab 3 ---------------------

        // Ask user for the first word
        System.out.print("Enter a string: ");

        // Capture the user input
        String firstWord = userInput.nextLine();

        // Ask user for the second word
        System.out.print("Enter a second string: ");

        // Capture the user input
        String secondWord = userInput.nextLine();

        // Check if the words are the same
        boolean sameWord = firstWord.equals(secondWord) ? true : false;

        // Print the correct message depending on the string comparison
        if (sameWord) {
            System.out.println("The strings are the same.");
        } else {
            System.out.println("The strings are not the same.");
        }

        /*
        Answer to Optional Question

        If you utilize "==" comparison operator, your essentially testing the memory address of the two objects.
        If both objects are referencing the same memory address, this will return true.
        */

        // Part 2 of Lab 3 ---------------------

        // Check the length of the 2 strings
        if (firstWord.length() > secondWord.length()) {
            System.out.println("\"" + firstWord + "\"" + " is longer than \"" + secondWord + "\"");
        } else if (firstWord.length() < secondWord.length()) {
            System.out.println("\"" + firstWord + "\"" + " is shorter than \"" + secondWord + "\"");
        } else {
            System.out.println("The strings have the same length.");
        }
    }
}
