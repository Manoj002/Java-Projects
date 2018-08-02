package com.rajeshpatkar;

public class MainProgram {

    public static void main(String[] args) {
        AStack s1 = new AStack();
        Client_1.useAStack(s1);
        Auditor.audit(s1);
        s1.print();
        LStack s2 = new LStack();
        Client_2.useLStack(s2);
        Auditor.audit(s2);
        s2.print();
    }
   
}
