/**
 * Name: James J. Kim
 * Title: Lab7.java
 * Author: James J. Kim
 * Description: Input and Display elements in an array
 * Time Spent: 20 Minutes
 * Date 11/14/2017
 */

import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args){

        // constant for the size of the array
        final int SIZE = 5;

        // instantiate an array
        int[] numbers = new int[SIZE];

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        // need a counter for the element index
        int counter = 0;

        // while loop to fill in the array
        System.out.println("Type in number to input into array");

        while(counter < SIZE){

            // get each number and store into an array using the
            // counter as the index
            numbers[counter] = scanner.nextInt();

            // increment the counter to prevent infinite loop
            counter++;
        }

        // Print out the message that you will be printing
        System.out.println("Processing each elements...");

        // iterate through each elements
        for (int i = 0; i < SIZE; i++) {

            System.out.println(numbers[i]);
        }


    }




}
