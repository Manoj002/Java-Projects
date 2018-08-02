package com.rajeshpatkar;

public class Client_1 extends Auditor {
    
    public static void useAStack(AStack s) {
            s.push(10);
            System.out.println("Client_1 pushed 10");
            s.push(20);
            System.out.println("Client_1 pushed 20");
            s.push(30);
            System.out.println("Client_1 pushed 30");
            System.out.println("Client_1 popped " + s.pop());
        }
    
}