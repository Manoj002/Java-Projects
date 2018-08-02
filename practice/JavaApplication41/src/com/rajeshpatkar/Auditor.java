package com.rajeshpatkar;

public class Auditor {
    
    public static void audit(Stack s) {
        System.out.println("Entering Auditor");
        System.out.println("Pushcount is " + s.getPushCount());
        System.out.println("Popcount is " + s.getPopCount());
        System.out.println("Leaving Auditor");
    }
}