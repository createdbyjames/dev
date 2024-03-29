//
//  FontInfoViewController.m
//  Fonts
//
//  Created by James Kim on 8/12/15.
//  Copyright © 2015 James. All rights reserved.
//

#import "FontInfoViewController.h"
#import "FavoritesList.h"

@interface FontInfoViewController ()

@property (weak, nonatomic) IBOutlet UILabel *fontSampleLabel;
@property (weak, nonatomic) IBOutlet UISlider *fontSizeSlider;
@property (weak, nonatomic) IBOutlet UILabel *fontSizeLabel;
@property (weak, nonatomic) IBOutlet UISwitch *favoriteSwitch;

@end

@implementation FontInfoViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
    
    self.fontSampleLabel.font = self.font;
    self.fontSampleLabel.text = @"AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz 0123456789";
    
    self.fontSizeSlider.value = self.font.pointSize;
    self.fontSizeLabel.text = [NSString stringWithFormat:@"%.0F", self.font.pointSize];
    self.favoriteSwitch.on = self.favorite;
}

- (IBAction) slideFontSize:(UISlider *)slider
{
    float newSize = roundf(slider.value);
    self.fontSampleLabel.font = [self.font fontWithSize: newSize];
    self.fontSizeLabel.text = [NSString stringWithFormat:@"%.0f", newSize];
}

- (IBAction) toggleFavorite:(UISwitch *) sender
{
    FavoritesList *favoritesList = [FavoritesList sharedFavoriteList];
    if (sender.on)
    {
        [favoritesList addFavorites: self.font.fontName];
    }
    else
    {
        [favoritesList removeFavorites: self.font.fontName];
    }
}


- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
