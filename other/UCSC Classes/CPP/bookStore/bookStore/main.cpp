//
//  main.cpp
//  bookStore
//
//  Created by James Kim on 9/11/15.
//  Copyright © 2015 James J. Kim. All rights reserved.
//

#include <iostream>
#include "Sales_data.hpp"

int main()
{
    std::cout << "Enter two numbers: " << std::endl;
    
    int v1 = 0;
    int v2 = 0;
    
    std::cin >> v1 >> v2;
    std::cout << "The sum of " << v1 << " and " << v2 << " is " << v1 + v2 << std::endl;
    
    return 0;
}