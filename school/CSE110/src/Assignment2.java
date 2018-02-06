/**
 * Name: James J. Kim
 * Title: Assignment2.java
 * Author: James J. Kim
 * Description: Calculate the total order
 * Time Spent: 20 Minutes
 * Date 10/20/2017
 */

/*
 PART 1 Answers:

1.
 a. true
 b. true
 c. true
 d. true

2.
Scanner userInput = new Scanner(System.in);

System.out.print("What's your full name? ");
String fullName = userInput.nextLine();
System.out.print("Full Name: " + fullName);

3. Hy
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment2 {

    public static void main(String[] args) {

        // Prices for the menu items
        final double HAMBURGER_PRICE = 2.75;
        final double CHEESEBURGER_PRICE = 3.25;
        final double FRENCHFRIES_PRICE = 2.50;
        final double BEVERAGE_PRICE = 1.50;

        // variable to hold the total
        double totalAmount = 0.0;

        // variable to hold the number of items
        int numberOfItems = 0;

        // variable to hold the highest cost
        double highestCost = 0.0;

        // variable to hold the highest cost item
        String highestCostItem = "None";

        // Instantiate helper objects to handle user input and output (formatting)
        Scanner userInput = new Scanner(System.in);
        NumberFormat totalFormat = NumberFormat.getCurrencyInstance();

        // Create a menu to display to the user
        String menu = "Welcome to the In-N-Out Burger menu:\n";
        menu += "--------------------------------------\n";
        menu += "\tHamburger $2.75\n";
        menu += "\tCheeseburger $3.25\n";
        menu += "\tFrench Fries $2.50\n";
        menu += "\tShake & Beverage: $1.50\n";
        menu += "--------------------------------------\n";

        // Display the menu to the user
        System.out.println(menu);

        // Ask the user for the number of items.
        System.out.print("How many hamburger(s) would you like to buy?: ");

        // get the number of orders and increment the total items ordered
        int items = userInput.nextInt();
        numberOfItems += items;

        // Calculate the cost of order
        double hamburgerCost = items * HAMBURGER_PRICE;

        // check to see if the order is the largest, if so then
        // update the highestCost and the hightCostItem with the
        // new value
        if (hamburgerCost > highestCost) {
            highestCostItem = "Hamburger";
            highestCost = hamburgerCost;
        }

        // Ask the user for the number of items.
        System.out.print("How many cheeseburger(s) would you like to buy?: ");

        // get the number of orders and increment the total items ordered
        items = userInput.nextInt();
        numberOfItems += items;

        // Calculate the cost of order
        double cheeseburgerCost = items * CHEESEBURGER_PRICE;

        // check to see if the order is the largest, if so then
        // update the highestCost and the hightCostItem with the
        // new value
        if (cheeseburgerCost > highestCost) {
            highestCostItem = "Cheeseburger";
            highestCost = cheeseburgerCost;
        }

        // Ask the user for the number of items.
        System.out.print("How many French fries would you like to buy?: ");

        // get the number of orders and increment the total items ordered
        items = userInput.nextInt();
        numberOfItems += items;

        // Calculate the cost of order
        double frenchFriesCost = items * FRENCHFRIES_PRICE;

        // check to see if the order is the largest, if so then
        // update the highestCost and the hightCostItem with the
        // new value
        if (frenchFriesCost > highestCost) {
            highestCostItem = "French Fries";
            highestCost = frenchFriesCost;
        }

        // Ask the user for the number of items.
        System.out.print("How many drinks would you like to buy?: ");

        // get the number of orders and increment the total items ordered
        items = userInput.nextInt();
        numberOfItems += items;

        // Calculate the cost of order
        double beveragesCost = items * BEVERAGE_PRICE;

        // check to see if the order is the largest, if so then
        // update the highestCost and the hightCostItem with the
        // new value
        if (beveragesCost > highestCost) {
            highestCostItem = "Beverages";
            highestCost = beveragesCost;
        }

        // Calculate the total cost
        totalAmount = hamburgerCost + cheeseburgerCost + frenchFriesCost + beveragesCost;

        // Print out the prices for each items
        System.out.println("\nThe total cost for the hamburger(s): " + totalFormat.format(hamburgerCost));
        System.out.println("The total cost for the cheeseburger(s): " + totalFormat.format(cheeseburgerCost));
        System.out.println("The total cost for fries: " + totalFormat.format(frenchFriesCost));
        System.out.println("The total cost for drink(s): " + totalFormat.format(beveragesCost));
        System.out.println("Which item had the highest total cost: " + highestCostItem);
        System.out.println("\nThe total cost for the order: "  + totalFormat.format(totalAmount));
        System.out.println("The total number of hamburgers, cheeseburgers, French fries, and drinks ordered: " + numberOfItems);

    }

}
