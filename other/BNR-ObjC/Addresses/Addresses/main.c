//
//  main.c
//  Addresses
//
//  Created by James on 5/22/18.
//  Copyright © 2018 James. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int i = 17;
    int *addressOfI = &i;
    printf("i stores its value at %p.\n", addressOfI);
    printf("i stores its value at %p.\n", &i);
    printf("this function starts at %p.\n", main);
    printf("the int stored at addressOfI is %d.\n", *addressOfI);
    *addressOfI = 89;
    printf("int stored at addressOfI is %d.\n", *addressOfI);
    printf("An int is %zu bytes.\n", sizeof(int));
    printf("A pointer is %zu bytes.\n", sizeof(int *));
    printf("An int is %zu bytes for i.\n", sizeof(i));
    printf("A pointer is %zu bytes.\n", sizeof(addressOfI));
    
    return 0;
}
