//
//  main.m
//  Challenge13
//
//  Created by James on 5/27/18.
//  Copyright © 2018 James. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        NSHost *host = [NSHost currentHost];
        NSString *computerName = [host localizedName];
        NSLog(@"Computer name is %@.", computerName);
        
        
    }
    return 0;
}
