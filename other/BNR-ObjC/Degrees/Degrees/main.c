//
//  main.c
//  Degrees
//
//  Created by James on 5/21/18.
//  Copyright © 2018 James. All rights reserved.
//

#include <stdio.h>

float fahrenheitFromCelcius(float cel) {
    float fahr = cel * 1.8 + 32.0;
    printf("%f Celcius is %f Fahrenheit\n", cel, fahr);
    return fahr;
}

int main(int argc, const char * argv[]) {
    
    float freezeInC = 0;
    float freezeInF = fahrenheitFromCelcius(freezeInC);
    printf("Water freezes at %f degrees Fahrenheit.\n", freezeInF);
    return 0;
}
