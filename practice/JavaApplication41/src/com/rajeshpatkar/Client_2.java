package com.rajeshpatkar;

public class Client_2 extends Auditor{

    public static void useLStack(LStack s) {
            s.push(10);
            System.out.println("Client_2 pushed 10");
            s.push(20);
            System.out.println("Client_2 pushed 20");
            s.push(30);
            System.out.println("Client_2 pushed 30");
            System.out.println("Client_2 popped " + s.pop());
        }
    
    
}