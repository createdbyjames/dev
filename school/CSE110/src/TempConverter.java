/**
 * Name: James J. Kim
 * Title: TempConverter.java
 * Author: NA
 * Description: Computers the Fahrenheit equivalent of specific Celsius value
 * Time Spent: 20 Minutes
 * Date 10/14/2017
 */

public class TempConverter {

    // Computes the Fahrenheit equivalent of a specific Celcius
    // value using the formula F = (9/5)C + 32

    public static void main(String[] args) {

        // Constant variables
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;

        // Declare variables
        int celsiusTemp = 24;   // Value to convert
        double fahrenheitTemp;

        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

        System.out.println("Celcius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}

/**
 * Part 1:
 * a. Compile Failure -  Class name mismatch to the filename.
 * b. Compile Failure - Tt doesn't know where the beginning of the string expression is.
 * c. Compile Failure - Java is expecting a ';' which indicates end of a statement
 * d. Compile Failure - Expecting an end of the file closing brace but now causing mismatch
 * e. Compile Failure - Java is unable to utilize a undeclared variable
 * */