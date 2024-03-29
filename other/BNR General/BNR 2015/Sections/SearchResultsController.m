//
//  SearchResultsController.m
//  Sections
//
//  Created by James Kim on 7/31/15.
//  Copyright © 2015 James. All rights reserved.
//

#import "SearchResultsController.h"

static NSString *SectionsTableIdentifier = @"SectionsTableIdentifier";

@interface SearchResultsController ()

@property (strong, nonatomic) NSDictionary *names;
@property (strong, nonatomic) NSArray *keys;
@property (strong, nonatomic) NSMutableArray *filteredNames;

@end

@implementation SearchResultsController

- (void)viewDidLoad
{
    [super viewDidLoad];
    
    [self.tableView registerClass:[UITableViewCell class] forCellReuseIdentifier: SectionsTableIdentifier];
}

- (instancetype) initWithNames:(NSDictionary *)names keys:(NSArray *)keys
{
    if (self = [super initWithStyle: UITableViewStylePlain])
    {
        self.names = names;
        self.keys = keys;
        self.filteredNames = [[NSMutableArray alloc] init];
    }
    
    return self;
}

#pragma mark -
#pragma mark - UISearchResultsUpdating Conformance

static const NSUInteger longNameSize = 6;
static const NSInteger shortNamesButtonIndex = 1;
static const NSInteger longNamesButtonIndex = 2;

- (void) updateSearchResultsForSearchController:(UISearchController *)searchController
{
    NSString *searchString = searchController.searchBar.text;
    NSInteger buttonIndex = searchController.searchBar.selectedScopeButtonIndex;
    
    [self.filteredNames removeAllObjects];
    if (searchString.length > 0)
    {
        NSPredicate *predicate = [NSPredicate predicateWithBlock: ^BOOL(NSString *name, NSDictionary *b)
                                  {
                                      //Filter out long or short names depending on which scope button is selected..
                                      NSUInteger nameLength = name.length;
                                      
                                      if ((buttonIndex == shortNamesButtonIndex && nameLength >= longNameSize) || (buttonIndex == longNamesButtonIndex && nameLength <  longNameSize))
                                      {
                                          return NO;
                                      }
                                      
                                      NSRange range = [name rangeOfString: searchString options: NSCaseInsensitiveSearch];
                                      
                                      return range.location != NSNotFound;
                                  }];
        
        for (NSString *key in self.keys)
        {
            NSArray *matches = [self.names[key] filteredArrayUsingPredicate: predicate];
            [self.filteredNames addObjectsFromArray: matches];
        }
    }
    
    [self.tableView reloadData];
}

- (NSInteger) tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return [self.filteredNames count];
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    UITableViewCell *cell = [self.tableView dequeueReusableCellWithIdentifier: SectionsTableIdentifier forIndexPath: indexPath];
    cell.textLabel.text = self.filteredNames[indexPath.row];
    return cell;
}

@end
