package com.gmb.goingtothemoonandbeyond;

public class PVector {


    public double x;

    public double y;

    public double z;


    public PVector() {
    }


    public PVector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }


    public PVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    static public PVector add(PVector v1, PVector v2) {
        return v1.add(v2);
    }


    public PVector add(PVector v) {
        return new PVector(x + v.x, y + v.y, z + v.z);
    }





    public PVector multiply(double n) {
        return new PVector(x * n, y * n, z * n);
    }















    public PVector add(double x, double y, double z) {
        return new PVector(this.x + x, this.y + y, this.z + z);
    }




    public PVector limit(double max) {
        if (magnitude() < max) {
            return copy();
        }
        return normalize().multiply(max);
    }


    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }


    public PVector copy() {
        return new PVector(x, y, z);
    }


    public PVector normalize() {
        double magnitude = magnitude();
        if (magnitude == 0 || magnitude == 1) {
            return copy();
        }
        return multiply(1 / magnitude);
    }




    @Override
    public String toString() {
        return "PVector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}


