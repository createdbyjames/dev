/*-------------------------------------------------------------------------
// AUTHOR: James J. Kim
// FILENAME: Triangle.java
// SPECIFICATION: Methods that define triangle object
// FOR: CSE 110- Assignment 4
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/


public class Triangle {

    // instance variables
    int side1;
    int side2;
    int side3;

    // default constructor
    public Triangle (int s1, int s2, int s3){

        if (s1 > 0 && s2 > 0 && s3 > 0){
            side1 = s1;
            side2 = s2;
            side3 = s3;
        }

    }

    // Returns the length of the longest side of the triangle
    private int largest() {

        int max = side1;

        // determine the longest side
        max = side2 >= max ? side2 : max;
        max = side3 >= max ? side3 : max;

        return max;
    }

    // Returns the length of the shortest side of the triangle
    private int shortest(){

        int min = side1;

        // determine the shortest side
        min = side2 <= min ? side2 : min;
        min = side3 <= min ? side3 : min;

        return min;
    }

    //  If the longest side is equal to the shortest side, then the triangle is equilateral.
    public boolean is_equilateral(){

        boolean isEquilateral = false;

        // determine if the shortest is the same as the longest
        if (largest() == shortest()) {

            isEquilateral = true;
        }

        return isEquilateral;
    }

    // Any (and at least) two sides must be equal.
    public boolean is_isosceles(){

        boolean isIsosceles = false;

        // determine if any 2 sides are equal
        if (side1 == side2 || side1 == side3 || side2 == side3){
            isIsosceles = true;
        }

        return isIsosceles;
    }

    // Determines whether a triangle is scalene. No two sides are equal.
    public boolean is_scalene(){

        boolean isScalene = false;

        // if 2 sides do not equal then return true
        if (side1 != side2 && side1 != side3 && side2 != side3){
            isScalene = true;
        }

        return isScalene;
    }

    // Prints the sides of the triangle.
    public String toString(){

        // Return the description of the triangle
        String output = "Sides: " + side1 + " , " + side2 + " , " + side3 + " ";

        return output;
    }

}
