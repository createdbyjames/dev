//
//  main.c
//  Turkey
//
//  Created by James on 5/9/18.
//  Copyright © 2018 James. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    // declare a variable called weight of a type float
    float weight;
    
    // Store a number in that variable
    weight = 14.2;
    
    // Log it to the user
    printf("The turkey weights %f.\n", weight);
    
    // Declare another varible type float
    float cookingTime;
    
    // Calculate the time and store it in that variable
    // In this case, "*" means multiplied by
    cookingTime = 15.0 + 15.0 * weight;
    
    // Log that to the user
    printf("Cook it for %f minutes.\n", cookingTime);
    
    // End the interaction
    return 0;
}
