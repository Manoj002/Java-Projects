package com.RajeshPatkar;

public class MainProgram {
    
    public static void main(String[] args) {
        C1 pg1 = new C1();   //*** Creation of object of pg1 which is just a reference of memory block in heap mgr ***//
        pg1.dep(500);
        pg1.dep(100);
        pg1.withdraw(50);
        pg1.statement();
    }
}
