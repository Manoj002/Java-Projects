package com.rajeshpatkar;

public class Ls_1 {

    public static void main(String[] args) {   // Administrator or Broker
        Stk1 s1 = new Stk1();   // Service Providers
        Stk2 s2 = new Stk2();   // Service Providers
        client3(s1);
        client2(s2);
        client1(s2);
        client3(s2);
        client3(s1);
    }
        
        static void client1(Stk h) {    // call to Service(Interface)
            h.push(10);
            h.push(20);
            h.push(30);
            h.pop();
            h.print();
        }
        
        static void client2(I1 q) {
            q.push(10);
            q.push(20);
            q.push(30);
            q.pop();
            q.print();
        }
        
        static void client3(I1 a) {
            a.m1();
            a.m2();
        }
        
}