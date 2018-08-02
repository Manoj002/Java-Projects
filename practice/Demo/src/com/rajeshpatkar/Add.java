package com.rajeshpatkar;

public class Add {
    private  int x;
    private  int y;
    
    public Add() {
        int x = 5;
        int y = 8;
    }
    
    public Add(int u, int v) {
        this.x = u;
        this.y = v;
    }
    
    public void print() {
        int z = x + y;
        System.out.println(x);
        System.out.println(y);
    }
}