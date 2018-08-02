package com.rajeshpatkar;

class Point {
    
    static {
        System.out.println("Static block");
        int x = 21; 
        int y = 22;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
    int x = 5;
    int y = 5;
    
    {
        System.out.println("Instance block");
        System.out.println(x);
        System.out.println(y);
    }
    
    void print() {
        System.out.println("x = "
                + x
                + " y = " + y
        );
    }
    
    static {
        System.out.println("Static block");
        int x = 23; 
        int y = 24;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
    {
        System.out.println("Instance block");
        System.out.println(x);
        System.out.println(y);
    }
    
    Point(int v1, int v2) {
        System.out.println("P Construct");
        System.out.println(x);
        System.out.println(y);
        x = v1;
        y = v2;
        System.out.println(x);
        System.out.println(y);
    }
    
    Point() {
        this(27, 28);
        x = 25;
        y = 26;
    }
}