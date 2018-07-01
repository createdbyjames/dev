//
//  main.c
//  PBR
//
//  Created by James on 5/22/18.
//  Copyright © 2018 James. All rights reserved.
//

#include <stdio.h>
#include <math.h>

void metersToFeetAndInches(double meters, unsigned int *ftPtr, double *inPtr) {
    // This function assumes meters is non-negative
    
    // Convert the number of meters into a floating-point number of feet
    double rawFeet = meters * 3.281;
    printf("Raw feet is %f.\n", rawFeet);
    
    // How many complete feet as an unsigned int?
    unsigned int feet = (unsigned int)floor(rawFeet);
    
    // Store the nunber of feet at the supplied address
    printf("Storing %u to the address of %p.\n", feet, ftPtr);
    *ftPtr = feet;
    
    // Calculate the inches
    double fractionFoot = rawFeet - feet;
    double inches = fractionFoot * 12.0;
    
    // Store the number of inches at the supplied address
    printf("Storing %.2f to the address of %p.\n", inches, inPtr);
    *inPtr = inches;
}

int main(int argc, const char * argv[]) {
    
    double meters = 3.0;
    unsigned int feet;
    double inches;
    
    metersToFeetAndInches(meters, &feet, &inches);
    printf("%.1f meters is equal to %d feet and %.1f inches.", meters, feet, inches);
    return 0;
}
