//
//  ContentCell.m
//  DialogViewer
//
//  Created by James Kim on 8/18/15.
//  Copyright © 2015 James. All rights reserved.
//

#import "ContentCell.h"

@implementation ContentCell

- (id) initWithFrame:(CGRect)frame
{
    self = [super initWithFrame: frame];
    
    if (self)
    {
        self.label = [[UILabel alloc] initWithFrame: self.contentView.bounds];
        self.label.opaque = NO;
        self.label.backgroundColor = [UIColor colorWithRed: 0.8 green: 0.9 blue: 1.0 alpha: 1.0];
        self.label.textColor = [UIColor blackColor];
        self.label.textAlignment = NSTextAlignmentCenter;
        self.label.font = [[self class] defaultFont];
        [self.contentView addSubview: self.label];
    }
    
    return self;
}

+ (UIFont *) defaultFont
{
    return [UIFont preferredFontForTextStyle: UIFontTextStyleBody];
}

+ (CGSize) sizeForContentString:(NSString *)string forMaxWidth:(CGFloat)maxWidth
{
    CGSize maxSize = CGSizeMake( maxWidth, 1000);
    NSStringDrawingOptions opts = NSStringDrawingUsesLineFragmentOrigin | NSStringDrawingUsesFontLeading;
    NSMutableParagraphStyle *style = [[NSMutableParagraphStyle alloc] init];
    [style setLineBreakMode: NSLineBreakByCharWrapping];
    
    NSDictionary *attributes = @{ NSFontAttributeName: [self defaultFont], NSParagraphStyleAttributeName: style};
    
    CGRect rect = [string boundingRectWithSize: maxSize options: opts attributes: attributes context: nil];
    
    return rect.size;
}

- (NSString *) text
{
    return self.label.text;
}

- (void) setText:(NSString *)text
{
    self.label.text = text;
    
    CGRect newLabelFrame = self.label.frame;
    CGRect newContentFrame = self.contentView.frame;
    CGSize textSize = [[self class] sizeForContentString: text forMaxWidth: _maxWidth];
    
    newLabelFrame.size = textSize;
    newContentFrame.size = textSize;
    self.label.frame = newLabelFrame;
    self.contentView.frame = newContentFrame;
}
@end
