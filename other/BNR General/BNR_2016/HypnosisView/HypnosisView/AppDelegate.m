//
//  AppDelegate.m
//  HypnosisView
//
//  Created by James Kim on 1/28/16.
//  Copyright © 2016 James. All rights reserved.
//

#import "AppDelegate.h"
#import "BNRHypnosisView.h"
#import "ViewController.h"

@interface AppDelegate ()

@end

@implementation AppDelegate


- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    
    self.window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];
    self.window.rootViewController = [[UIViewController alloc] init];
    
//    CGRect firstFrame = self.window.bounds;
//    BNRHypnosisView *firstView = [[BNRHypnosisView alloc] initWithFrame: firstFrame];
    
    //Create CGRects for frame
    CGRect screenRect = self.window.bounds;
    
    CGRect bigRect = screenRect;
    bigRect.size.width *= 5.0;
    bigRect.size.height *= 5.0;
    
    //Create a screensize scroll view and add it to the window
    UIScrollView *scrollView = [[UIScrollView alloc] initWithFrame: screenRect];
    [self.window addSubview: scrollView];
    
    BNRHypnosisView *hypnosisView = [[BNRHypnosisView alloc] initWithFrame: bigRect];
    [scrollView addSubview: hypnosisView];
    
    //tell the scrollview how big the size is.
    scrollView.contentSize = bigRect.size;
    

    self.window.backgroundColor = [UIColor whiteColor];
    [self.window makeKeyAndVisible];

    [self.window.rootViewController.view addSubview: scrollView];
    
    return YES;
}

- (void)applicationWillResignActive:(UIApplication *)application {
    // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
    // Use this method to pause ongoing tasks, disable timers, and throttle down OpenGL ES frame rates. Games should use this method to pause the game.
}

- (void)applicationDidEnterBackground:(UIApplication *)application {
    // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
    // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
}

- (void)applicationWillEnterForeground:(UIApplication *)application {
    // Called as part of the transition from the background to the inactive state; here you can undo many of the changes made on entering the background.
}

- (void)applicationDidBecomeActive:(UIApplication *)application {
    // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
}

- (void)applicationWillTerminate:(UIApplication *)application {
    // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
}

@end
