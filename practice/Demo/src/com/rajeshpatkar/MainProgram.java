package com.rajeshpatkar;

import java.io.*;

public class MainProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        String s = kin.readLine();
        int i = Integer.parseInt(s);
        System.out.println("Enter second integer:");
        s = kin.readLine();
        int j = Integer.parseInt(s);
        Add a1 = new Add();
        a1.print();
        Multiply a2 = new Multiply();
        a2.print();
    }
    
}
