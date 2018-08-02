package com.rajeshpatkar;

import java.io.*;

public class Stack {

    int[] stk;
    int sp;

    Stack(int v) {

        stk = new int[v];
        sp = v;
    }

    Stack() {

        this(10);
    }

    void push(int v) {

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

    int pop() {

        if (sp == 10) {
            System.out.println("Underflow");
            return -1;
        } else {
            int temp = stk[sp];
            sp = sp + 1;
            return temp;
        }
    }

    void print() {

        System.out.println("Printing stack");
        for (int i = sp; i < stk.length; i++) {
            System.out.println(stk[i]);
        }
    }

    void load(String s) throws FileNotFoundException, IOException {
        BufferedReader kin = new BufferedReader(new FileReader(s));
        String t = kin.readLine();
        
        System.out.println(t);
        
    }
}
