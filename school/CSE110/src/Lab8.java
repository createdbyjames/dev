/**
 * Name: James J. Kim
 * Title: Lab8.java
 * Author: James J. Kim
 * Description: Input and Display elements in an array
 * Time Spent: 20 Minutes
 * Date 11/19/2017
 */

public class Lab8 {

    public static void main(String [] args) {

        // Create an Arrays object using the first constructor
        Arrays arr1 = new Arrays(5);

        // Print the contents of the array in arr1
        System.out.println(arr1);

        // Call findMin, findMax, and calcAverage on arr1 and print their values
        System.out.println("Min: " + arr1.findMin());
        System.out.println("Max: " + arr1.findMax());
        System.out.println("Average: " + arr1.calcAverage());
        System.out.println();


        // Second Arrays Object
        int [] intArray = {1, 2, 3};
        Arrays arr2 = new Arrays(intArray);

        System.out.println(arr2);

        // Call findMin, findMax, and calcAverage on arr1 and print their values
        System.out.println("Min: " + arr2.findMin());
        System.out.println("Max: " + arr2.findMax());
        System.out.println("Average: " + arr2.calcAverage());
        System.out.println();

    }

}
