package com.rajeshpatkar;

public class AStack extends Stack{
    
    private static int [] stk = new int[10];
    private static int sp = 10;
    
    public void push (int v) {
        if(sp == 0) {
            System.out.println("Overflow");
        } else {
            sp = sp - 1;
            stk[sp] = v;
        }
        pushCount++;
    }
    
    public int pop() {
        int temp = -1;
        if( sp == 10) {
            System.out.println("Underflow");
        } else {
            temp = stk[sp];
            sp = sp + 1;
        }
        popCount++;
        return temp;
    }
    
    public void print() {
        System.out.println("Printing AStack");
        for(int i = sp; i < 10; i++) {
            System.out.println(stk[i]);
        }
    }
}