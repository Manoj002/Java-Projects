package com.rajeshpatkar;

public class Multiply extends Add{
    
    private int x;
    private int y;
    private int z;
    
    public Multiply() {
        super(9, 9);
        this.z = super.print();
    }
    
    public Multiply(int u) {
        
    }
        
    @Override
    public void print() {
        int z;
        System.out.println(x * y);
    }
}