/*-------------------------------------------------------------------------
// AUTHOR: James J. Kim
// FILENAME: Assignment5.java
// SPECIFICATION: Test Driver for Assignment Geek.java
// FOR: CSE 110- Assignment #5
// TIME SPENT: 20
//----------------------------------------------------------------------*/

import java.util.*;

public class Assignment5 {

    public static void main (String[] args) {

        Scanner console = new Scanner (System.in);

        String choice;
        char command;


        // print the menu
        printMenu();

        // create new Geek object
        Geek myGeek = new Geek("Geek", 0);

        do
        {
            // ask a user to choose a command
            System.out.println("\nPlease enter a command or type ?");
            choice = console.next().toLowerCase();
            command = choice.charAt(0);

            switch (command)
            {
                case 'a':
                    //prints the Geek's name
                    System.out.println("Name: " + myGeek.getName());

                    break;
                case 'b':
                    System.out.println("Number of questions: " +
                            myGeek.getNumberOfQuestions());
                    break;
                case 'c':
                    //asks for two integers and finds and prints if their sum is even or odd
                    System.out.print("Enter first number: ");
                    int firstNumber = console.nextInt();

                    System.out.print("Enter second number: ");
                    int secondNumber = console.nextInt();

                    if (myGeek.isEven(firstNumber, secondNumber)) {
                        System.out.println("The sum of the numbers is even");
                    } else {
                        System.out.println("The sum of the numbers is odd");
                    }

                    break;
                case 'd':
                    //asks for two integers and finds and prints the sum of all integers between them (inclusive)
                    System.out.print("Enter first number: ");
                    int num1 = console.nextInt();

                    System.out.print("Enter second number: ");
                    int num2 = console.nextInt();

                    System.out.println("Sum between " + num1 + " and " + num2 + " is " + myGeek.sum(num1, num2));

                    break;
                case 'e': //
                    //asks for a year and finds out and prints if is leap year or not
                    System.out.print("Enter a year: ");
                    int year = console.nextInt();

                    if (myGeek.leapYear(year)) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }

                    break;
                case '?':
                    printMenu();
                    break;
                case 'q':
                    break;

                default:
                    System.out.println("Invalid input");

            }

        } while (command != 'q');

    }  //end of the main method


    public static void printMenu()
    {
        System.out.print("\nCommand Options\n"
                + "-----------------------------------\n"
                + "a: get name\n"
                + "b: number of questions asked\n"
                + "c: sum is even\n"
                + "d: sum between two integers\n"
                + "e: leap year\n"
                + "?: display the menu again\n"
                + "q: quit this program\n\n");

    } // end of the printMenu method

}  // end Assignment5 class