//
//  main.m
//  Challenge14
//
//  Created by James on 5/27/18.
//  Copyright © 2018 James. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        NSDateComponents *dateComponents = [[NSDateComponents alloc] init];
        [dateComponents setYear: 1974];
        [dateComponents setMonth: 7];
        [dateComponents setDay: 22];
        [dateComponents setHour: 10];
        [dateComponents setMinute: 22];
        [dateComponents setSecond: 10];
        
        NSCalendar *g = [[NSCalendar alloc] initWithCalendarIdentifier: NSCalendarIdentifierGregorian];
        NSDate *birthdayDay = [g dateFromComponents: dateComponents];
        
         NSLog(@"My birthday is %@", birthdayDay);
        
        NSDate *now = [[NSDate alloc] init];
        double sinceTime = [now timeIntervalSinceDate: birthdayDay];
        
        NSLog(@"Its been %f seconds since my birthday!", sinceTime);
        
        
        
    }
    return 0;
}
