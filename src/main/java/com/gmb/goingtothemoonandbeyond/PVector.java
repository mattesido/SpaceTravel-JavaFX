package com.gmb.goingtothemoonandbeyond;

public class PVector {
    public static PVector ZERO = new PVector(0, 0);

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


    static public PVector multiply(PVector v, double n) {
        return v.multiply(n);
    }


    public PVector multiply(double n) {
        return new PVector(x * n, y * n, z * n);
    }


    static public double distance(PVector v1, PVector v2) {
        return v1.distance(v2);
    }


    public double distance(PVector v) {
        double dx = x - v.x;
        double dy = y - v.y;
        double dz = z - v.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    static public double dot(PVector v1, PVector v2) {
        return v1.dot(v2);
    }


    public double dot(PVector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    static public PVector cross(PVector v1, PVector v2) {
        return v1.cross(v2);
    }


    public PVector cross(PVector v) {
        double crossX = y * v.z - v.y * z;
        double crossY = z * v.x - v.z * x;
        double crossZ = x * v.y - v.x * y;
        return new PVector(crossX, crossY, crossZ);
    }


    static public double angleBetween(PVector v1, PVector v2) {
        double dot = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
        double v1mag = Math.sqrt(v1.x * v1.x + v1.y * v1.y + v1.z * v1.z);
        double v2mag = Math.sqrt(v2.x * v2.x + v2.y * v2.y + v2.z * v2.z);
        return Math.acos(dot / (v1mag * v2mag));
    }


    public void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void set(PVector v) {
        x = v.x;
        y = v.y;
        z = v.z;
    }

    public PVector add(double x, double y, double z) {
        return new PVector(this.x + x, this.y + y, this.z + z);
    }

    public double dot(double x, double y, double z) {
        return this.x * x + this.y * y + this.z * z;
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


    public double heading2D() {
        double angle = Math.atan2(-y, x);
        return -1 * angle;
    }

    @Override
    public String toString() {
        return "PVector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}


