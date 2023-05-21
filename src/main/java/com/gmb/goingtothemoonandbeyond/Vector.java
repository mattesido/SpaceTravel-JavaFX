package com.gmb.goingtothemoonandbeyond;

public class Vector {
    public double x;
    public double y;

    public Vector() {
        set(0,0);
    }

    public Vector(double x, double y) {
        set(x,y);
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add( double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void multiply(double multipler) {
        x *= multipler;
        y *= multipler;
    }

    public double getLength() {
        return Math.sqrt( x*x + y*y );
    }

    public void setLength(double targetLength) {
        double currentLength = getLength();

        // if current length is 0 then current angle is undefined
        // assume current angle is 0 (pointing to the right)
        if (currentLength == 0) {
            set(targetLength, 0);
        } else { //able to preserve current angle...
            // scale vector to have length 1
            multiply(1/currentLength);

            // scale vector to have length targetLength
            multiply(targetLength);
        }
    }

    public double getAngleInDegrees() {
        return Math.toDegrees(Math.atan2(y,x));
    }

    public void setAngleInDegrees(double angleDegrees) {
        double currentLength = getLength();
        double angleRadians = Math.toRadians(angleDegrees);
        x = currentLength * Math.cos(angleRadians);
        y = currentLength * Math.sin(angleRadians);
    }



}



