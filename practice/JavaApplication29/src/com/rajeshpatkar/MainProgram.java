package com.rajeshpatkar;

public class MainProgram {
    
    public static void main(String[] args) {
        Point pt1 = new Point();
        System.out.println(pt1);
        Point pt2 = new Point(3, 4);
        System.out.println(pt2);
        Point pt3 = new Point(5,6);
        System.out.println(pt3);
        Segment s1 = new Segment();
        System.out.println(s1);
        Segment s2 = new Segment(1,2,3,4);
        System.out.println(s2);
        Segment s3 = new Segment(pt1, pt2);
        System.out.println(s3);
        Segment s4 = new Segment(pt2, pt3);
        System.out.println(s4);
    }
}

class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}

class Segment {
    Point e1;
    Point e2;
    
    Segment() {
        e1 = new Point();
        e2 = new Point();
    }

    Segment(int i, int i0, int i1, int i2) {
        this.e1 = new Point(i, i0);
        this.e2 = new Point(i1, i2);
    }

    @Override
    public String toString() {
        return " e1 = " + e1 + " e2 = " + e2;
    }
    
    Segment(Point e1, Point e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
}
