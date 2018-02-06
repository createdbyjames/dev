/**
 * Name: James J. Kim
 * Title: Arrays.java
 * Author: James J. Kim
 * Description: Arrays to handle methods
 * Time Spent: 20 Minutes
 * Date 11/19/2017
 */

import java.util.Random;

public class Arrays {

    // Instance Variables
    private int[] array;
    private int count;

    // Constructors
    public Arrays(int size) {

        // instantiate the array object
        array = new int[size];

        // set the count to the size of the array
        this.count = size;

        // fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            array[i] = (rand.nextInt(10));
        }
    }

    // second constructor
    public Arrays(int[] arr) {

        // copy the references to the array object
        array = arr;

        // copy the length of the arr to the count
        count = arr.length;
    }

    // findMin
    public int findMin() {
        int min = array[0]; // Set min to the first element
        for (int i = 1; i < count; i++) {
        // Reassign min if there is a smaller element
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min; // Return the smallest element
    }

    // findMax
    public int findMax() {

        // set the initial value to the max
        int max = array[0];

        // iterate through and find the max
        for (int i = 0; i < count; i++) {

            if (array[i] > max){

                max = array[i];
            }
        }

        return max;

    }

    // calcSum
    private int calCSum() {

        // sum variable
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += array[i];
        }

        return sum;
    }

    // calcAverage
    public double calcAverage() {

        // variable to hold the average
        double average;

        return calCSum() / count;
    }

    // toString
    public String toString() {
        String output = "[ ";
        for (int i = 0; i < count; i++) {
            output += array[i];
            if (i != count - 1) {
                output += ", ";
            }
        }
        return output + " ]";
    }

}
