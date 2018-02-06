import java.util.Arrays;

/**
 * Name: James J. Kim
 * Title: NumberCollection.java
 * Author: James J. Kim
 * Description: Collection
 * Time Spent: 20 Minutes
 * Date 11/14/2017
 */

import java.util.Arrays;

public class NumberCollection {

    // private instance variables
    // array to hold the numbers
    private int[] numberArray;

    // hold the nunber of elements added
    private int count;

    /**
     * It constructs an empty NumberCollection object with
     an array capacity specified by the integer parameter arraySize. That is, it stores a new int array with
     size arraySize in the numberArray instance variable.
     */
    public NumberCollection(int arraySize) {

        // verify that the array size isn't instantiated with zero value
        if (arraySize > 0) {
            numberArray = new int[arraySize];
        } else {
            System.out.println("Array size must be greater than 0. Initialized with size 1");
            numberArray = new int[1];
        }
    }


    /**
     * It returns the index of the number specified by the
     parameter is located. If the number is not found, it returns -1. This is a helper method.
     */
    private int indexOf(int searchingNum) {

        // hold the index where searchNum was stored
        int index = -1;

        // iterate through the array and detemine if the number is found
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == searchingNum) {
                index = i;
            }
        }

        return index;
    }

    // helper method to determine if the array is full
    private boolean isArrayFull(){

        //boolean flag to determine if the array is full
        boolean isFull = true;

        for(int numbers : numberArray) {
            if (numbers == 0){
                isFull = false;
            }
        }

        return isFull;
    }

    // helper method to verify that the array isn't empty
    private boolean isEmpty() {

        // flag to determine if the array is empty
        boolean empty = false;

        // make sure that numberArray isn't empty
        if (numberArray.length == 0) {
            empty = true;
        }

        return empty;
    }


    /**
     * The method will add numberToAdd at the smallest
     available index in the array, if the number is not in already in the array. Be sure to check if the number
     is already in the array:
     ✅ Hint: This can be done using the indexOf method to see if it returns -1 or not
     ✅ If the number is in the array, then it will not be added again and the method returns false to
        indicate that nothing was added.
     ✅ If the number is NOT in the array, continue.
     ✅ If the number is not in the array, be sure to check if the array has reached its capacity.
     ✅ if the capacity is reached.
     ✅ – If the capacity is reached, double the length of numberArray.
     ✅ If the number is not in the array and after updating the capacity, if necessary, then add numberToAdd
     to numberArray at the smallest available index.
     ✅ If the number is added successfully, then the method returns true.
     */
    public boolean addNumber(int numberToAdd) {

        // bool to see if adding the number was successful;
        boolean isAdded = true;

        // flat to identify the first & smallest index in the array
        int emptyIndex = -1;

        // verify that the number doesnt exists in the array
        // -1 is NOT found & anything else indicates the index
        if (indexOf(numberToAdd) == -1) {

            // check if the array is full...
            if (isArrayFull()) {

                // create a temp array with a larger size
                int[] tempArray = Arrays.copyOf(numberArray, numberArray.length * 2);

                // assign the numberArray references to the new
                numberArray = tempArray;
            }

            // find the lowest index available
            for (int i = numberArray.length - 1; i >= 0; i--){

                    // identify the very first empty element that has ZERO
                    if (numberArray[i] == 0) {

                        // finds the very lowest index available
                        emptyIndex = i;
                    }
                }

            // double check to make sure that the next empty index has been identified
            if (emptyIndex != -1) {

                // use the index number and insert the value
                numberArray[emptyIndex] = numberToAdd;

                // increment the total number of items
                count++;

                // Set the emptyIndex back to -1
                emptyIndex = -1;
            }

        } else {

            isAdded = false;
        }

        // Return the boolean flag
        return isAdded;
    }

    /**
     * It finds the maximum number among the numbers stored so far (at the time
     when this method is called), and returns it. If the array is empty, return 0.
     */
    public int findMax() {

        // initially set the very first item in the array as max
        int max = numberArray[0];

        // check if the array is empty
        if (!isEmpty()) {

            // iterate through the array and evaluate the max value
            for (int i = 0; i < numberArray.length; i++) {
                if (numberArray[i] > max) {
                    max = numberArray[i];
                }
            }
        }

        return max;
    }

    /**
     * It finds the minimum number among the numbers stored so far (at the time
     when this method is called), and returns it. If the array is empty, return 0.
     */
    public int findMin() {

        // initially set the very first item in the array as max
        int min = numberArray[0];

        // iterate through the array and evaluate the max value
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < min) {
                min = numberArray[i];
            }
        }

        return min;
    }

    /**
     * It computes and returns the sum of numbers stored in numberArray so
     far (at the time when this method is called.) If the array is empty, return 0.
     */
    public int computeSum() {

        // variable to hold the sum of all the elements in the arrya
        int sum = 0;

        // make sure that numberArray isn't empty
        if (!isEmpty()) {

            for (int i = 0; i < numberArray.length; i++) {
                sum += numberArray[i];
            }

        }

        return sum;
    }

    /**
     *  Returns a String containing a list of numbers stored in numberArray.
     An example of such string can be:
     {3, 6, -1, 3, 23, -50, 43}
     */
    public String toString() {

        // variable to for return String
        String output = "{";

        int index = 0;

        while (index < numberArray.length - 1) {

            // concat to the output string until you reach the second to last element
            output += numberArray[index] + ", ";

            // increment the index;
            index++;
        }

        // add the last element with the proper string format
        output += numberArray[numberArray.length - 1] + "}";

        return output;
    }
}
