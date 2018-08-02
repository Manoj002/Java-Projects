package com.rajeshpatkar;

public class MainProgram {

    public static void main(String[] args) {
        Stk s1 = new Stk();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.print();
        int w = s1.pop();
        System.out.println("Popped value = " + w);
        s1.print();
    }   
}
