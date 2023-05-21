package com.gmb.goingtothemoonandbeyond;

public class Rectangle {
    // (x,y) represents the top-left corner of the Rectangle
    double x;
    double y;
    double width;
    double height;

    public Rectangle() {
        this.setPosition(0,0);
        this.setSize(1,1);
    }

    public Rectangle(double x, double y, double width, double height) {
        this.setPosition(x,y);
        this.setSize(width,height);
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public boolean overlaps(Rectangle other) {
        // Four cases where there is no overlap:
        //  1: this to the left of other
        //  2: this to the right of other
        //  3: this is above other
        //  4: other is above this
        boolean noOverlap = this.x + this.width < other.x ||
                other.x + other.width < this.x ||
                this.y + this.height < other.y ||
                other.y + other.height < this.y;

        return !noOverlap;
    }


}
