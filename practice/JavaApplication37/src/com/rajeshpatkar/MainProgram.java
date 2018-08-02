package com.rajeshpatkar;

import java.io.*;    // Interactive stack

public class MainProgram {

    public static void main(String[] args) throws IOException {
        Stack s1 = new Stack(20);
        s1.print();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.print();
        s1.store("D://Manoj.txt");
        s1.print();
        s1.load("D://Input.txt");
        s1.print();
        int w = s1.pop();
        System.out.println("Popped vlaue = " + w);
        s1.print();
        int x = s1.peek();
        System.out.println("Peek value = " + x);
        s1.flush();
        s1.print();
    }
    
    int menu() throws IOException {
        BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for push"
                + "Enter 2 for pop"
                + "Enter 3 for peek"
                + "Enter 4 for store"
                + "Enter 5 for load"
                + "Enter 6 for flush"
                + "Enter 7 for print"
                + "Enter 8 for exit"
        );
        String str = kin.readLine();
        int i = Integer.parseInt(str);
        return i;
    }
}