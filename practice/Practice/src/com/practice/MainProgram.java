package com.practice;

import javax.swing.*;
import java.awt.*;

public class MainProgram {

    public static void main(String[] args) {
        System.out.println("Welcome to SWING!!!");
        JFrame f1 = new JFrame("Hello");
        JButton b1 = new JButton("South");
        JButton b2 = new JButton("North");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        FlowLayout flow = new FlowLayout();
        f1.setLayout(flow);
        f1.add(BorderLayout.NORTH,b2);
        f1.add(BorderLayout.EAST,b3);
        f1.add(BorderLayout.WEST,b4);
        f1.setSize(600, 500);
        JTextField tf = new JTextField(10);
        f1.add(BorderLayout.SOUTH, tf);
        JTextArea ta = new JTextArea(10, 10);
        f1.add(BorderLayout.CENTER,ta);
        f1.setVisible(true);
        f1.setLocation(100, 100);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}