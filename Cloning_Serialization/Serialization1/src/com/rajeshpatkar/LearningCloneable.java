package com.rajeshpatkar;

public class LearningCloneable {

    public static void main(String[] args) throws Exception {

        Point pt1 = new Point(5, 5);
        Point pt2 = new Point(10, 5);
        Point pt3 = new Point(5, 10);
        Point pt4 = new Point(10, 10);

        Segment seg1 = new Segment(pt1, pt2);
        Segment seg2 = new Segment(pt2, pt3);
        Segment seg3 = new Segment(pt3, pt4);
        Segment seg4 = new Segment(pt4, pt1);

        Rectangle rect = new Rectangle(seg1, seg2, seg3, seg4);

        Rectangle clonedRect = rect.clone();

        System.out.println("printing the original and cloned"
                + " rectangle objects before modifying\n\n");

        System.out.println("ORG : " + rect);
        System.out.println("CLONED : " + clonedRect);

        System.out.println("\n\nmodifying the cloned Segment... \n\n");

        clonedRect.setS1(23, 45, 12, 56);

        System.out.println("printing the original and cloned segment objects after modification \n\n");
        System.out.println("ORG : " + rect);
        System.out.println("CLONED : " + clonedRect);

    }

}

class Point implements Cloneable {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point)super.clone();
    }
}

class Segment implements Cloneable {

    private Point p1;
    private Point p2;

    public Segment() {
    }

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(int x, int y) {
        this.p1.setX(x);
        this.p1.setY(y);
    }

    public void setP2(int x, int y) {
        this.p2.setX(x);
        this.p2.setY(y);
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "Segment{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }

    @Override
    public Segment clone() throws CloneNotSupportedException {
        Segment s = (Segment)super.clone();
        s.p1 = this.p1.clone();
        s.p2 = this.p2.clone();
        return s;
    }
}

class Rectangle implements Cloneable
{
    Segment s1 ;
    Segment s2 ;
    Segment s3 ;
    Segment s4 ;

    public Rectangle(Segment s1, Segment s2, Segment s3, Segment s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public Rectangle() {
    }

    public Segment getS1() {
        return s1;
    }

    public void setS1(int x1 , int y1 , int x2 , int y2) {
        this.s1.setP1(x1, y1);
        this.s1.setP2(x2, y2);
    }


    public Segment getS2() {
        return s2;
    }

    public void setS2(int x1 , int y1 , int x2 , int y2) {
        this.s2.setP1(x1, y1);
        this.s2.setP2(x2, y2);
    }

    public Segment getS3() {
        return s3;
    }

    public void setS3(int x1 , int y1 , int x2 , int y2) {
        this.s3.setP1(x1, y1);
        this.s3.setP2(x2, y2);
    }

    public Segment getS4() {
        return s4;
    }
    
    public void setS4(int x1 , int y1 , int x2 , int y2) {
        this.s4.setP1(x1, y1);
        this.s4.setP2(x2, y2);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4 + '}';
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
         Rectangle rect = (Rectangle)super.clone();
         rect.s1 = this.s1.clone();
         rect.s2 = this.s2.clone();
         rect.s3 = this.s3.clone();
         rect.s4 = this.s4.clone();
         return rect;
    }
    
}