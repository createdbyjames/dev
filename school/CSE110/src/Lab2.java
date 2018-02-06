//***********************************************************
// AUTHOR: James J. Kim
// FILENAME: Lab2.java
// SPECIFICATION: Finding an average of test scores
// FOR: CSE 110 - Lab #2
// TIME SPENT: 10 Minutes
//***********************************************************

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        // Instantiate a scanner object
        Scanner in = new Scanner(System.in);

        // Declaring variables to hold the test scores
        int score1;
        int score2;
        int score3;

        // Constant to declare number of tests
        final int NUMBER_OF_TESTS = 3;

        // Average score
        double average_score;

        // Prompt the user for their 1st test score input
        System.out.print("Enter the score on the first test: ");
        score1 = in.nextInt();

        // Prompt the user for their 2nd test score input
        System.out.print("Enter the score on the second test: ");
        score2 = in.nextInt();

        // Prompt the user for their 3rd test score input
        System.out.print("Enter the score on the third test: ");
        score3 = in.nextInt();

        // Calculate the average of 3 test scores
        average_score = (double)(score1 + score2 + score3) / NUMBER_OF_TESTS;

        // Output the score the user
        System.out.printf("Your average test score was %.2f", average_score);

    }


}
