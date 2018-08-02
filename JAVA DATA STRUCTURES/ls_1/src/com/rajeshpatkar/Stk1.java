package com.rajeshpatkar;

import java.io.*;

public class Stk1 implements Stk, I1{   // Service Provider(Server)

    int[] stk = new int[10];
    int sp = 10;

    @Override
    public void push(int v) {

        if (sp == 0) {
            System.out.println("Overflow");
        } else {
            sp = sp - 1;
            stk[sp] = v;
        }
    }
    
    void store(String s) throws IOException {
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(s)), true);
        for(int i = sp; i < stk.length; i++) {
            pw.println(stk[i]);
        }
    }
  
    int peek() {
        
        if(sp != stk.length) {
        return stk[sp];
        } else {
            return -1;
        }
    }

    void flush() {

        sp = stk.length;
    }

    @Override
    public int pop() {

        if (sp == 10) {
            System.out.println("Underflow");
            return -1;
        } else {
            int temp = stk[sp];
            sp = sp + 1;
            return temp;
        }
    }

    @Override
    public void print() {

        System.out.println("Printing stack");
        for (int i = sp; i < stk.length; i++) {
            System.out.println(stk[i]);
        }
    }
    
    @Override
    public void m1() {
        System.out.println("Entered m1");
        System.out.println("Leaving m1");
    }
    
    @Override
    public void m2() {
        System.out.println("Entered m2");
        System.out.println("Leaving m2");
    }
}
